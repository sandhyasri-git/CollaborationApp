package niit.colloborations.controller;

import java.io.IOException;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import niit.colloborations.model.Blog;
import niit.colloborations.service.BlogService;
import com.google.gson.Gson;

@Controller
public class BlogController {

	@Autowired
	private BlogService blogservice;
	

	@RequestMapping("/newblog")
	public String createBlog(HttpServletRequest request,Model model)
	{
		String name=request.getParameter("user");
		model.addAttribute("name",name);
		System.out.println("In Blog Controller");
		return "blog";
	}
	
	
	@ModelAttribute("blog")
	public Blog returnObject()
	{
		return new Blog();
	}
	
	
	@RequestMapping("/bpost")
	public String createBlog(@ModelAttribute("blog") Blog blog,Model model)throws IOException
	{
		blog.setUser_name("ss1");
		blog.setCreationDate(new java.util.Date());
		blogservice.createNewBlog(blog);
		return "blog";
	}
	
	
	String setName;
	List<Blog> blist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			blist = blogservice.getBlog();
			Gson gson = new Gson();			  
			result = gson.toJson(blist);			
			return result;
	}

	
	

}
