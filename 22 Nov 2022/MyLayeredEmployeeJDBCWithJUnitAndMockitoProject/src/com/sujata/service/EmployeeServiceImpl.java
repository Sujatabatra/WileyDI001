package com.sujata.service;

import java.util.Collection;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.persistence.EmployeeDao;

import lombok.Setter;


public class EmployeeServiceImpl implements EmployeeService {

	//Service will request persistence layer for all data needs
	@Setter
	private EmployeeDao employeeDao;
	
	@Override
	public Collection<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee searchEmployeeById(int id) {
		return employeeDao.searchRecord(id);
	}

	@Override
	public boolean addEmployee(Employee employee) {
		if(employeeDao.insertRecord(employee)>0)
			return true;
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		if(employeeDao.deleteRecord(id)>0)
			return true;
		return false;
	}

	@Override
	public boolean incrementSalary(int id, double increment) {
		if(employeeDao.updateSalary(id,increment)>0)
			return true;
		return false;
	}

	/*
	 * Business Rule
	 * AllowancesA : 18% of salary
	 * AllowanceB : 12% of salary
	 * Dedeuction : 8% of salary
	 */
	@Override
	public EmployeePaySlip generatePaySlip(int employeeId) {
		Employee employee=employeeDao.searchRecord(employeeId);
		if(employee!=null) {
			//logical error : instead of 18% by mistake we calculated 16%
			double allowanceA=.16*employee.getEmpSalary();  //1800
			double allowanceB=.12*employee.getEmpSalary(); //1200
			double deduction=.08*employee.getEmpSalary();  //800
			double totalSalary=employee.getEmpSalary()+allowanceA+allowanceB-deduction; //10000+1800+1200-800=12200
			
			EmployeePaySlip employeePaySlip=new EmployeePaySlip(employee, allowanceA, allowanceB, deduction,totalSalary);
			return employeePaySlip;
		}
		return null;
		
	}

}
