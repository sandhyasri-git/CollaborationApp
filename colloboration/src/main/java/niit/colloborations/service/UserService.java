package niit.colloborations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import niit.colloborations.dao.UserDAO;
import niit.colloborations.model.User;

@Service
public class UserService {
	@Autowired
	UserDAO	userDAO;
	
	/* public boolean login(String user,String pass)
	 {
		 return userDAO.login(user, pass);
		 
	 }*/
	public void saveOrUpdate(User user)
	{
		userDAO.saveOrUpdate(user);	
	}
	public List<User> list()
	{
		List<User> list=userDAO.list();
		return list;
	}
	/*public User getUserById(int id)
	{
		return userDAO.getUserById(id);
	}*/
	public User getUserByName(String name)
	{
		return userDAO.getUserByName(name);
	}
	/*public void delete(int id)
	{
		userDAO.delete(id);
	}*/
}
