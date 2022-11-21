package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDaoImpl;

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

	@Test
	void testGetAllRecords() {
		assertTrue(employeeDaoImpl.getAllRecords().size()>0);
	}

	
	@Test
	void testInsertRecord() {
		assertEquals(1, employeeDaoImpl.insertRecord(new Employee(108,"HHHH","Executive","Sales",34000,LocalDate.now())));
	}
}
