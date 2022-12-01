package com.sujata.controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public ModelAndView menuPageController() {
		return new ModelAndView("index");
	}
	// =============================================================

	// ===== Controllers for Delete=================================
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
	// ==============================================================

	// =============Controllers for increment Salary==================
	@RequestMapping("/incrementSalaryPage")
	public ModelAndView incrementSalaryPageController() {
		return new ModelAndView("InputForIncrementSalary");
	}

	@RequestMapping("/incrementSalary")
	public ModelAndView incrementSalaryController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		int id = Integer.parseInt(request.getParameter("eId"));
		double incrementAmount = Double.parseDouble(request.getParameter("increment"));
		String message = null;
		if (employeeService.incrementSalary(id, incrementAmount))
			message = "Employee with ID " + id + " Salary incremented with amount " + incrementAmount;
		else
			message = "Employee with ID " + id + " doesnot exist";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		return modelAndView;
	}
	// ================================================================

	// =============Controller for List all Employees==================
	@RequestMapping("/showAll")
	public ModelAndView getAllEmployeesController() {
		ModelAndView modelAndView = new ModelAndView();
		Collection<Employee> empList = employeeService.getAllEmployees();

		modelAndView.addObject("employees", empList);
		modelAndView.setViewName("ShowAllEmployees");
		return modelAndView;
	}
	// ===================================================================

	// =============Controllers for Search Employee By ID==================
	@RequestMapping("/searchEmployeeByIDInputPage")
	public ModelAndView searchEmployeeByIDInputPageController() {
		return new ModelAndView("InputIdForSearch");
	}

	@RequestMapping("/searchEmployeeByID")
	public ModelAndView searchEmployeeById(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		int id = Integer.parseInt(request.getParameter("empId"));

		Employee employee = employeeService.searchEmployeeById(id);
		if (employee != null) {
			modelAndView.addObject("employee", employee);
			modelAndView.setViewName("ShowEmployee");
		} else {
			modelAndView.addObject("message", "Employee with ID " + id + " does not exist");
			modelAndView.setViewName("Output");
		}

		return modelAndView;
	}
	// =============================================================

	// =============Controllers for Search Employee By Department
	// Name==================
	@RequestMapping("/searchEmployeesByDepartmentInputPage")
	public ModelAndView searchEmployeeByDepartmentInputPageController() {
		return new ModelAndView("InputDepartmentForSearch");
	}

	@RequestMapping("/searchEmployeeByDepartment")
	public ModelAndView searchEmployeeByDepartmentController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		String deptt = request.getParameter("department");
		List<Employee> empList = employeeService.getEmployeesByDepartment(deptt);

		if (empList.size() > 0) {
			modelAndView.addObject("employees", empList);
			modelAndView.setViewName("ShowAllEmployees");
		} else {
			modelAndView.setViewName("Output");
			modelAndView.addObject("message", "No Employee works in department " + deptt);
		}

		return modelAndView;
	}
	// ============================================================
	
	//=============Controllers for adding new Employee=================
	@RequestMapping("/addEmpPage")
	public ModelAndView addPageController() {
		return new ModelAndView("InputInfoForAdd");
	}

	@RequestMapping("/addEmployee")
	public ModelAndView addEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		Employee newEmployee = new Employee();
		int empId = Integer.parseInt(request.getParameter("empId"));
		String name = request.getParameter("employeeName");
		String designation = request.getParameter("designation");
		String depatment = request.getParameter("department");
		double salary = Double.parseDouble(request.getParameter("salary"));
		LocalDate doj = LocalDate.parse(request.getParameter("doj"));
		String message = null;

		newEmployee.setEmpId(empId);
		newEmployee.setEmpName(name);
		newEmployee.setEmpDesignation(designation);
		newEmployee.setEmpDepartment(depatment);
		newEmployee.setEmpSalary(salary);
		newEmployee.setDateOfJoining(doj);

		if (employeeService.addEmployee(newEmployee))
			message = "Employee Added with ID " + empId;
		else
			message = "Employee with ID " + empId + " already exists";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");

		return modelAndView;
	}

	// ======================================================================================
	@RequestMapping("/searchEmployeesByDesignationInputPage")
	public ModelAndView searchEmployeesByDesignationInputPageController() {
		return new ModelAndView("InputDesignationForSearch");
	}

	@RequestMapping("/searchEmployeesByDesignation")
	public ModelAndView searchEmployeesByDesignation(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		String designation = request.getParameter("designation");

		Collection<Employee> empListDept = employeeService.searchByDesignation(designation);

		if (empListDept.size() != 0) {
			modelAndView.addObject("employees", empListDept);
			modelAndView.setViewName("ShowAllEmployees");
		} else {
			modelAndView.addObject("message", "No employees with " + designation);
			modelAndView.setViewName("Output");
		}

		return modelAndView;
	}
    //==============================================================================
	
	@RequestMapping("/deleteEmpNamePage")
	public ModelAndView deleteEmpNamePageController() {
		return new ModelAndView("InputNameForDelete");
	}
	
	@RequestMapping("/deleteEmployeeByName")
	public ModelAndView deleteEmployeeNameController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		String name=request.getParameter("employeeName");
		String message=null;
		if(employeeService.deleteEmployeeByName(name))
			message= name + " deleted as employee";
		else
			message=name + " does not exist in the system";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	//=================================================================================
	
	@RequestMapping("/generatePayslipIdInputPage")
	public ModelAndView generatePayslipIdInputPageController() {
		return new ModelAndView("InputIdForPayslip");
	}

	@RequestMapping("/generatePayslip")
	public ModelAndView generatePayslip(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		int id=Integer.parseInt(request.getParameter("empId"));
		
		EmployeePaySlip paySlip=employeeService.generatePaySlip(id);
		if(paySlip!=null) {
			modelAndView.addObject("paySlip", paySlip);
			modelAndView.setViewName("ShowPayslip");
		}
		else {
			modelAndView.addObject("message", "Employee with ID "+id+" does not exist");
			modelAndView.setViewName("Output");
		}
		
		return modelAndView;
	}
    //===================================================================================
}
