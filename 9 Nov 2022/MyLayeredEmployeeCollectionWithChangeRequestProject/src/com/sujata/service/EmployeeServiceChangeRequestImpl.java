package com.sujata.service;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceChangeRequestImpl extends EmployeeServiceImpl {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	
	/*
	 * Business Rule
	 * AllowancesA : 18% of salary   => change to 20% of salary
	 * AllowanceB : 12% of salary    => change to 11% of Salary
	 * Dedeuction : 8% of salary     => change to 6% of salary
	 */
	@Override
	public EmployeePaySlip generatePaySlip(int employeeId) {
		Employee employee=employeeDao.searchRecord(employeeId);
		if(employee!=null) {
			double allowanceA=.20*employee.getEmpSalary();
			double allowanceB=.11*employee.getEmpSalary();
			double deduction=.06*employee.getEmpSalary();
			double totalSalary=employee.getEmpSalary()+allowanceA+allowanceB-deduction;
			
			EmployeePaySlip employeePaySlip=new EmployeePaySlip(employee, allowanceA, allowanceB, deduction,totalSalary);
			return employeePaySlip;
		}
		return null;
		
	}
}
