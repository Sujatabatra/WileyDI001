package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculatorForSequenceOfMethods {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("1. setUpBefore Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("2. TearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("a. setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("b. tearDown");
	}

	@Test
	void testDivide1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	void testDivide2() {
		System.out.println("Test Case 2");
	}

}
