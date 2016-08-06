package niit.colloborations.controller;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import niit.colloborations.model.Blog;
import niit.colloborations.model.Forum;
import niit.colloborations.service.BlogService;
import niit.colloborations.service.ForumService;
@Controller
public class ForumController {
	
	@Autowired
	private ForumService forumservice;
	
	
	@RequestMapping("/newforum")
	public ModelAndView showForum()
	{
		System.out.println("forum page");
		ModelAndView mv= new ModelAndView("forum");
		return mv;
	}
	@ModelAttribute("forum")
	public Forum returnObject()
	{
		return new Forum();
	}
	@RequestMapping("/fpost")
	public String createBlog(@ModelAttribute("forum") Forum forum,Model model)throws IOException
	{
		
		forum.setUser_name("sandhya");
		forum.setCreationDate(new java.util.Date());
		forumservice.createNewForum(forum);
		return "forum";
	}

	String setName;
	List<Forum> flist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon1")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			flist = forumservice.getForum();
			Gson gson = new Gson();			  
			result = gson.toJson(flist);			
			return result;
	}




}




















