package niit.colloborations.dao;

import java.util.List;

import niit.colloborations.model.Blog;



public interface BlogDAO {
	public List<Blog> getBlogList(String user_name);
	public List<Blog> getBlog();
	public void createNewBlog(Blog blog);
	public Blog getBlogById(int id);
	public Blog getBlogByName(String name);
	public void delete(int id);


}
