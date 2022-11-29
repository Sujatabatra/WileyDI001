package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.service.FactorialService;

@Controller
public class FactorialController {

	@Autowired
	private FactorialService factorialService;
	
	@RequestMapping("/")
	public ModelAndView mainPageController() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/calculate")
	public ModelAndView calculateFactorialController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		//request.getParameter() will return String
		int num=Integer.parseInt(request.getParameter("number"));

		int factorial=factorialService.getFactorial(num);
		
		modelAndView.addObject("fact", factorial);
		
		modelAndView.setViewName("Output");
		
		return modelAndView;
		
	}
}
