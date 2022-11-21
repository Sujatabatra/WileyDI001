package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

@DisplayName("Testing Calculator Class")
class TestCalculator {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Nested
	class CheckDivide {
		@DisplayName("divide 20 by 5")
		@Test
		void R001_T001() throws NegativeNumberException {
			assertEquals(4, calculator.divide(20, 5));
		}

		@DisplayName("divide -20 by 5")
		@Test
		void R001_T002() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-20, 5));
		}

		@Test
		void R001_T003() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(20, -5));
		}

		@Test
		void R001_T004() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.divide(-20, -5));
		}

		@Test
		void R001_T005() throws NegativeNumberException {
			assertEquals(0, calculator.divide(0, 5));
		}

		@Test
		void R001_T006() throws NegativeNumberException {
			assertThrows(ArithmeticException.class, () -> calculator.divide(20, 0));
		}
	}

	@Nested
	class CheckAdd {
		@Test
		void R002_T001() throws NegativeNumberException {
			assertEquals(25, calculator.add(20, 5));
		}

		@DisplayName("add -20 by 5")
		@Test
		void R002_T002() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.add(-20, 5));
		}

		@Test
		void R002_T003() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.add(20, -5));
		}

		@Test
		void R002_T004() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> calculator.add(-20, -5));
		}

		@Test
		void R002_T005() throws NegativeNumberException {
			assertEquals(5, calculator.add(0, 5));
		}

		@Test
		void R002_T006() throws NegativeNumberException {
			assertEquals(20, calculator.add(20, 0));
		}
	}
}
