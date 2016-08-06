package niit.colloborations.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import niit.colloborations.dao.UserDAO;
import niit.colloborations.model.Message;
import niit.colloborations.model.OutputMessage;
import niit.colloborations.model.User;
import niit.colloborations.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userservice;

	@RequestMapping("/")
	public ModelAndView showWelcome() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping("/home")
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView showLogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

/*	@RequestMapping("/SignUp")
	public ModelAndView showRegister() {
		ModelAndView mv = new ModelAndView("SignUp");
		return mv;
	}*/

	@RequestMapping("/chatt")
	public ModelAndView showChat() {
		ModelAndView mv = new ModelAndView("chatpage");
		System.out.println("in chat controller");
		return mv;
	}

	 @MessageMapping("/chat")
	  @SendTo("/topic/message")
	  public OutputMessage sendMessage(Message message) {
	    return new OutputMessage(message, new Date());
	  }

	 @RequestMapping("/SignUp")
		public ModelAndView showNewUser() {
			ModelAndView mv = new ModelAndView("SignUp");
			System.out.println("in Home controller");
			return mv;
		}
	
}







