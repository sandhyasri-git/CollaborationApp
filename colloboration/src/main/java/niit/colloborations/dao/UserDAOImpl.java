package niit.colloborations.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import niit.colloborations.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	public UserDAOImpl() {
	
	
	}
	@Autowired
	private SessionFactory sessionFactory;


	public UserDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<User> list() {
		
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return list;
	}

	public void saveOrUpdate(User user) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	public User getUserById(int id) {
		
		Session session=this.sessionFactory.getCurrentSession();
		User user=(User) session.load(User.class,id);
		System.out.println("data of user by id="+user);
		return user;	

	}
	public User getUserByName(String name) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		User user=(User) session.get(User.class,name);
		System.out.println("data of user by name="+user);
		return user;	

	}
	
	@Transactional
	public void delete(int id) {
		User user = new User();
		
		sessionFactory.getCurrentSession().delete(user);
		System.out.println("Deleting the User");
	}
	}


