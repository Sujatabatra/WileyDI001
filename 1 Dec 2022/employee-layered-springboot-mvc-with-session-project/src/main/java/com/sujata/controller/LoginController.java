package com.sujata.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.User;
import com.sujata.model.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public ModelAndView loginPageController() {
		return new ModelAndView("LoginPage", "user", new User());
	}
	
	@RequestMapping("/login")
	public ModelAndView loginController(@ModelAttribute("user") User user,HttpSession session) {
		ModelAndView modelAndView=new ModelAndView();
		
		if(loginService.loginCheck(user)) {
			modelAndView.addObject("user", user);  //request scope
			session.setAttribute("user", user);  //data is set on session scope i.e data availble in multiple request and response cycles
			modelAndView.setViewName("index");
		}
		else {
			modelAndView.addObject("message", "Invalid User Credentials, Please try again");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("LoginPage");
		}
			
		return modelAndView;
	}
}
