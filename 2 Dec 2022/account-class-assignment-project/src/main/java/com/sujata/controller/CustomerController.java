package com.sujata.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Customer;
import com.sujata.model.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/")
	public ModelAndView getLoginPageController() {
		return new ModelAndView("index");
	}

	@RequestMapping("/login")
	public ModelAndView loginController(@RequestParam("accountId") int id,@RequestParam("pwd") String password,HttpSession session) {
		ModelAndView modelAndView=new ModelAndView();
		Customer customer=customerService.loginCheck(id, password);
		if(customer!=null) {
			session.setAttribute("customer", customer);
			modelAndView.setViewName("TransactionPage");
		}
		else {
			modelAndView.addObject("message", "Login Failed, Please try again");
			modelAndView.setViewName("index");
		}
		
		return modelAndView;
	}

	@RequestMapping("/transferFunds")
	public ModelAndView transferFundsController(@RequestParam("accountId")int recepientAccountId,@RequestParam("amount") double balance,HttpSession session) {
		ModelAndView modelAndView=new ModelAndView();
		
		int myAccountId=((Customer)session.getAttribute("customer")).getAccountId();
		Customer customer=customerService.transferFunds(myAccountId, recepientAccountId,balance );
		if(customer==null) {
			modelAndView.addObject("message", "Transaction Failed");
			session.setAttribute("customer", customer);
		}else
			modelAndView.addObject("message", "Your Account has been debited with balance "+balance+" and credited in Account No"+recepientAccountId+" and your current Balance is "+customer.getCustomerBalance());
		
		modelAndView.setViewName("Output");
		return modelAndView;
	}
}
