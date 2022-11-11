package com.sujata.persistence;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sujata.database.EmployeeDataBase;
import com.sujata.entity.Employee;

/*
 * If we don't specify component name,
 * then component name will be same as that of class name but in camelCase
 */
//@Component("dao")
@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {

	
	
	@Override
	public Collection<Employee> getAllRecords() {
		return EmployeeDataBase.getEmployeeList().values();
	}

	@Override
	public Employee searchRecord(int id) {
		return EmployeeDataBase.getEmployeeList().get(id);
		
	}

	@Override
	public Employee insertRecord(Employee employee) {
		return EmployeeDataBase.getEmployeeList().put(employee.getEmpId(), employee);
	}

	@Override
	public Employee deleteRecord(int id) {
		
		return EmployeeDataBase.getEmployeeList().remove(id);
	}

}
