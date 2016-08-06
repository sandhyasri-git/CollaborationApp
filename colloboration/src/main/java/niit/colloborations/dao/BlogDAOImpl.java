package niit.colloborations.dao;

import java.util.List;

import org.hibernate.*;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import niit.colloborations.model.Blog;
import niit.colloborations.model.BlogBody;
import niit.colloborations.model.User;

@Repository
@Transactional
public class BlogDAOImpl implements BlogDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public BlogDAOImpl(){}
	public BlogDAOImpl(SessionFactory sf){
		this.sessionFactory =sf;
	}
	public void createNewBlog(Blog blog)
	{
		
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println(blog);
		s.saveOrUpdate(blog);
		t.commit();		
	}
	
	@SuppressWarnings("unchecked")
	public List<Blog> getBlogList(String user_name)
	{
		Session session=sessionFactory.openSession();
		Criteria c=session.createCriteria(Blog.class);
		c.add(Restrictions.eq("user_name", user_name));
		List <Blog> blog=c.list();
		return blog;
	}
	
	
	
	public Blog getBlogById(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		Blog blog=(Blog) session.load(Blog.class,id);
		System.out.println("data of blog by id="+blog);
		return blog;	
		
	}

	public Blog getBlogByName(String name) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		Blog blog=(Blog) session.get(Blog.class,name);
		System.out.println("data of Blogs by name="+blog);
		return blog;	

	}
	@Transactional
	public void delete(int id) {
		Blog blog = new Blog();
		
		sessionFactory.getCurrentSession().delete(blog);
		System.out.println("Deleting the Blog");
	}
	
	@SuppressWarnings("unchecked")
	public List<Blog> getBlog()
	{

		List<Blog> blog;
			System.out.println("in blog DAO");
		Session session=this.sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		org.hibernate.Query qury=session.createQuery("from Blog");
		
		System.out.println(qury.toString());
		blog=(List<Blog>)qury.list();
		tx.commit();
		return blog;
		
	}

		}



