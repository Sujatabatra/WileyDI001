package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

class TestCalculator {

	private Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	void R001_T001() throws NegativeNumberException {
		assertEquals(4, calculator.divide(20, 5));
	}
	@Test
	void R001_T002() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class,()->calculator.divide(-20, 5));
	}
	
	@Test
	void R001_T003() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class,()->calculator.divide(20, -5));
	}
	
	@Test
	void R001_T004() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class,()->calculator.divide(-20, -5));
	}
	@Test
	void R001_T005() throws NegativeNumberException {
		assertEquals(0, calculator.divide(0, 5));
	}
	@Test
	void R001_T006() throws NegativeNumberException {
		assertThrows(ArithmeticException.class,()->calculator.divide(20, 0));
	}
	

}
