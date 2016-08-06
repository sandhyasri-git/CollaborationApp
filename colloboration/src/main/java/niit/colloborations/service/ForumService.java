package niit.colloborations.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import niit.colloborations.dao.ForumDAO;
import niit.colloborations.model.Blog;
import niit.colloborations.model.Forum;

@Service
public class ForumService {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	ForumDAO forumDAO;
	
	public ForumService(){}
	public ForumService(SessionFactory sf){
		this.sessionFactory=sf;
	}
	
	public void createNewForum(Forum f)
	{
		forumDAO.createNewForum(f);
	}
	public List<Forum> getForumList(String user_name)
	{
		List<Forum>f=forumDAO.getForumList(user_name);
		return f;
	}
	public void delete(int id)
	{
		 forumDAO.delete(id);
	}
	public List<Forum> getForum()
	{
		System.out.println("in Forum service");
		return forumDAO.getForum();
	}


}
