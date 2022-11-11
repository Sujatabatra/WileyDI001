package com.sujata.database;

import java.util.LinkedHashMap;
import java.util.Map;

import com.sujata.entity.Employee;
/*
 * mimicing the database: which later on we will going to change once we will do JDBC and MySql
 */
public class EmployeeDataBase {

	static private Map<Integer, Employee> employeeList=new LinkedHashMap<Integer, Employee>();
	
	
	static {
		employeeList.put(101, new Employee(101, "AAAA", "Executive", "IT", 12000));
		employeeList.put(102, new Employee(102, "BBBB", "Associate", "IT", 93000));
		employeeList.put(103, new Employee(103, "CCCC", "Sr. Executive", "Purchase", 18000));
		employeeList.put(104, new Employee(104, "DDDD", "Manager", "IT", 62000));
		employeeList.put(105, new Employee(105, "EEEE", "Sr. Manager", "Sales", 78000));
		
	}

	public static Map<Integer, Employee> getEmployeeList() {
		return employeeList;
	}
	
	
}
