package niit.colloborations.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import niit.colloborations.model.Blog;
import niit.colloborations.model.BlogBody;
import niit.colloborations.model.Forum;

@Repository
public class ForumDAOImpl implements ForumDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void createNewForum(Forum f)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		System.out.println(f);
		s.save(f);
		t.commit();
	}
	
		@SuppressWarnings("unchecked")
	public List<Forum> getForumList(String user_name) {

		Session session=sessionFactory.openSession();
		Criteria c=session.createCriteria(Forum.class);
		c.add(Restrictions.eq("user_name", user_name));
		List <Forum> forum=c.list();
		return forum;
	}
	public void delete(int id) {
		Forum f = new Forum();
		
		sessionFactory.getCurrentSession().delete(f);
		System.out.println("Deleting the Forum");
	}

	@SuppressWarnings("unchecked")
	public List<Forum> getForum()
	{

		List<Forum> forum;
		System.out.println("in forum DAO");
		Session session=this.sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		org.hibernate.Query qury=session.createQuery("from Forum");
		
		System.out.println(qury.toString());
		forum=(List<Forum>)qury.list();
		tx.commit();
		return forum;
		
	}


	public Blog getForumById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Blog getForumByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}