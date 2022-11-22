package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;
import com.sujata.persistence.EmployeeDao;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

class TestEmployeeService {

	private EmployeeServiceImpl employeeServiceImpl;
	private EmployeeDao employeedao;
	
	@BeforeEach
	void setUp() throws Exception {
		employeeServiceImpl=new EmployeeServiceImpl();
		
		employeedao=Mockito.mock(EmployeeDao.class);
		employeeServiceImpl.setEmployeeDao(employeedao);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddEmployeeOne() {
		//Specifying the behavior of the mock
		when(employeedao.insertRecord(new Employee(110, "JJJJ", "Exdecutive", "Sales", 23000, LocalDate.now()))).thenReturn(1);
		
		assertTrue(employeeServiceImpl.addEmployee(new Employee(110, "JJJJ", "Exdecutive", "Sales", 23000, LocalDate.now())));
	}
	
	@Test
	void testAddEmployeeTwo() {
		when(employeedao.insertRecord(new Employee(110, "JJJJ", "Exdecutive", "Sales", 23000, LocalDate.now()))).thenReturn(0);
		
		assertFalse(employeeServiceImpl.addEmployee(new Employee(110, "JJJJ", "Exdecutive", "Sales", 23000, LocalDate.now())));
	}

	@Test
	void testDeleteEmployeeOne() {
		when(employeedao.deleteRecord(101)).thenReturn(1);
		
		assertTrue(employeeServiceImpl.deleteEmployee(101));
		
	}

	@Test
	void testDeleteEmployeeTwo() {
		when(employeedao.deleteRecord(101)).thenReturn(0);
		
		assertFalse(employeeServiceImpl.deleteEmployee(101));
		
	}
//	@Test
//	void testIncrementSalary() {
//		fail("Not yet implemented");
//	}

	@Test
	void testGeneratePaySlip() {
		when(employeedao.searchRecord(101)).thenReturn(new Employee(101, "AAAA", "Executive", "HR", 10000, LocalDate.now()));
		
		EmployeePaySlip paySlip=new EmployeePaySlip(new Employee(101, "AAAA", "Executive", "HR", 10000, LocalDate.now()), 1800, 1200, 800, 12200);
		
		assertEquals(paySlip, employeeServiceImpl.generatePaySlip(101));
		
	}

}
