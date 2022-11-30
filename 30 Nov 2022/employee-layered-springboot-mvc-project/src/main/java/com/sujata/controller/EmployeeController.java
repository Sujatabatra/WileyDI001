package com.sujata.controller;

import java.time.LocalDate;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public ModelAndView menuPageController() {
		return new ModelAndView("index");
	}

	//===== Controller for Delete===================
	@RequestMapping("/deleteEmpPage")
	public ModelAndView deletePageController() {
		return new ModelAndView("InputIdForDelete");
	}

	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		int eId = Integer.parseInt(request.getParameter("empId"));

		String message = null;
		if (employeeService.deleteEmployee(eId))
			message = "Employee Deleted with ID " + eId;
		else
			message = "Employee with ID " + eId + " doesnot exist";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");

		return modelAndView;
	}
	//==================================================
	
	//=============Controller for increment Salary==================
	@RequestMapping("/incrementSalaryPage")
	public ModelAndView incrementSalaryPageController() {
		return new ModelAndView("InputForIncrementSalary");
	}
	
	@RequestMapping("/incrementSalary")
	public ModelAndView incrementSalaryController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		
		int id=Integer.parseInt(request.getParameter("eId"));
		double incrementAmount=Double.parseDouble(request.getParameter("increment"));
		String message=null;
		if(employeeService.incrementSalary(id, incrementAmount))
			message="Employee with ID "+id+" Salary incremented with amount "+incrementAmount;
		else
			message="Employee with ID "+id+" doesnot exist";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		return modelAndView;
	}
	//===========================================================
	
	@RequestMapping("/showAll")
	public ModelAndView getAllEmployeesController() {
		ModelAndView modelAndView=new ModelAndView();
		Collection<Employee> empList=employeeService.getAllEmployees();
		
		modelAndView.addObject("employees", empList);
		modelAndView.setViewName("ShowAllEmployees");
		return modelAndView;
	}
	

}
