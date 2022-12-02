package com.sujata.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Collection<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee searchEmployeeById(int id) {

		return employeeDao.findById(id).orElse(null);

	}

//	@Override
//	public boolean addEmployee(Employee employee) {
//
//		if (searchEmployeeById(employee.getEmpId()) == null) {
//			// save means : save and update
//			employeeDao.save(employee);
//			return true;
//		}
//		return false;
//	}

	@Override
	public boolean addEmployee(Employee employee) {
	try{
		employeeDao.insertEmployee(employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(),
				employee.getEmpDepartment(), employee.getEmpSalary(), employee.getDateOfJoining()) ;
		return true;
	}
	catch(SQLIntegrityConstraintViolationException ex) {
		return false;
	}
	catch(Exception ex) {
		return false;
	}
}

	@Override
	public boolean deleteEmployee(int id) {
		if (searchEmployeeById(id) != null) {
			employeeDao.deleteById(id);
			return true;
		}
		return false;
	}

//	@Override
//	public boolean incrementSalary(int id, double increment) {
//		Employee employee=searchEmployeeById(id);
//		if(employee!=null) {
//			employee.setEmpSalary(employee.getEmpSalary()+increment);
//			employeeDao.save(employee);
//			return true;
//		}
//		return false;
//	}
	@Override
	public boolean incrementSalary(int id, double increment) {
		return employeeDao.updateSalary(id, increment) > 0;
	}

	/*
	 * Business Rule AllowancesA : 18% of salary AllowanceB : 12% of salary
	 * Dedeuction : 8% of salary
	 */
	@Override
	public EmployeePaySlip generatePaySlip(int employeeId) {
		Employee employee = searchEmployeeById(employeeId);
		if (employee != null) {
			double allowanceA = .18 * employee.getEmpSalary();
			double allowanceB = .12 * employee.getEmpSalary();
			double deduction = .08 * employee.getEmpSalary();
			double totalSalary = employee.getEmpSalary() + allowanceA + allowanceB - deduction;

			EmployeePaySlip employeePaySlip = new EmployeePaySlip(employee, allowanceA, allowanceB, deduction,
					totalSalary);
			return employeePaySlip;
		}
		return null;

	}

	@Override
	public List<Employee> getEmployeesByDepartment(String deptt) {

		return employeeDao.findByEmpDepartment(deptt);
	}

	@Override
	public List<Employee> searchByDesignation(String designation) {

		return employeeDao.searchEmployeeByDesignation(designation);

	}

	@Override
	public boolean deleteEmployeeByName(String name) {

		return employeeDao.deleteByName(name) > 0;
	}

}
