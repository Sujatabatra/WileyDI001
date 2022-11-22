package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDaoImpl;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeDaoTest {

	EmployeeDaoImpl employeeDaoImpl;
	
	@BeforeEach
	void setUp() throws Exception {
		employeeDaoImpl=new EmployeeDaoImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		employeeDaoImpl=null;
	}

	@DisplayName("Check Get All records")
	@Order(1)
	@Test
	void T001() {
		assertTrue(employeeDaoImpl.getAllRecords().size()>0);
	}

	
	@DisplayName("Search For Employee with Id 110")
	@Order(3)
	@Test
	void T002() {
		Employee emp=new Employee(110,"IIII","Manager","Sales",78000,LocalDate.of(2021, 01, 12));
		assertEquals(emp , employeeDaoImpl.searchRecord(110));
	}
	
	@DisplayName("Search For Employee with Id 100 -Negative")
	@Order(4)
	@Test
	void T003() {
		assertNull(employeeDaoImpl.searchRecord(100));
		
	}
	
	@DisplayName("Add New Employee with ID 110")
	@Order(2)
	@Test
	void T004() {
		assertEquals(1, employeeDaoImpl.insertRecord(new Employee(110,"IIII","Manager","Sales",78000,LocalDate.of(2021, 01, 12))));
	}
	
	@DisplayName("Updating Salary of Employee ID 110 by 500")
	@Order(5)
	@Test
	void T007() {
//		assertEquals(1,employeeDaoImpl.updateSalary(109, 500));
		employeeDaoImpl.updateSalary(110, 500);
		assertEquals(78500, employeeDaoImpl.searchRecord(110).getEmpSalary());
	}
	
	@DisplayName("Updating Salary of Employee ID 100 by 200 - Negative")
	@Order(6)
	@Test
	void T008() {
		assertEquals(0, employeeDaoImpl.updateSalary(100,200));
	}
	
	@DisplayName("Delete Employee ID 100 - Negative")
	@Order(8)
	@Test 
	void T006(){
		assertEquals(0, employeeDaoImpl.deleteRecord(100));
	}
	
	@DisplayName("Delete Employee ID 110")
	@Order(7)
	@Test
	void T005() {
		assertEquals(1, employeeDaoImpl.deleteRecord(110));
	}
}
