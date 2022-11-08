package com.sujata.persistence;

import java.util.Collection;
import java.util.List;

import com.sujata.database.EmployeeDataBase;
import com.sujata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	
	
	@Override
	public Collection<Employee> getAllRecords() {
		return EmployeeDataBase.getEmployeeList().values();
	}

}
