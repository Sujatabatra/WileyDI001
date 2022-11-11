package com.sujata.persistence;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sujata.database.EmployeeDataBase;
import com.sujata.entity.Employee;

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
