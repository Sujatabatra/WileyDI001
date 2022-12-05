package com.sujata.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(path = "/employees",method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE)
	public Collection<Employee> getAllEmployeesResource(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(path = "/employees/{eid}",method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE)
	public Employee searchEmployeeByIdResource(@PathVariable("eid") int id) {
		return employeeService.searchEmployeeById(id);
	}
	
	@RequestMapping(path="/employees",method = RequestMethod.POST,produces = MediaType.TEXT_PLAIN_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addEmployeeResource(@RequestBody Employee employee) {
		if( employeeService.addEmployee(employee))
			return "Record added";
		else
	
			return "Record not added";
	}
	
	@RequestMapping(path="/employees/{eId}",method = RequestMethod.DELETE,produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteEmployeeResource(@PathVariable("eId") int id) {
		if(employeeService.deleteEmployee(id))
			return "Employee Deleted";
		else
			return "Employee Not Deleted";
	}
	
	@RequestMapping(path = "/employees/{eId}/{inc}",method = RequestMethod.PUT,produces = MediaType.TEXT_PLAIN_VALUE)
	public String incrementSalary(@PathVariable("eId") int id,@PathVariable("inc") double increment) {
		if(employeeService.incrementSalary(id, increment))
			return "Salary Incremented";
		else
			return "Salary Not Incremented";
					
	}
}
