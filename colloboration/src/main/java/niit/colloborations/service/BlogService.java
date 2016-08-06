package niit.colloborations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import niit.colloborations.dao.BlogDAO;
//import niit.colloborations.dao.BlogDAO;
import niit.colloborations.model.Blog;
import niit.colloborations.model.BlogBody;

@Service
public class BlogService {
	
	@Autowired
	private BlogDAO blogdao;
	
	public void createNewBlog(Blog blog)
	{
		blogdao.createNewBlog(blog);
	}
	
	public List<Blog> getBlogList(String user_name)
	{
		return blogdao.getBlogList(user_name);
	}
	public Blog getBlogById(int id)
	{
		return new Blog();
	}
	public Blog getBlogByName(String name)
	{
		return new Blog();
	}
	
	public List<Blog> getBlog()
	{
		System.out.println("in blog service");
		return blogdao.getBlog();
	}


}
