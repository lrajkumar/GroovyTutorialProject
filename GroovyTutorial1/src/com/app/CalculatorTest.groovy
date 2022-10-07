package com.app

import static org.junit.Assert.*
import static org.junit.jupiter.api.Assertions.assertEquals

import java.lang.annotation.Repeatable


import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test



class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	void setup() {
		calculator  =new Calculator();
	}
	
	@Test
	void testMultiply() {
		assertEquals(20, calculator.multiply(4, 5),"Regular Multiplication should work");
	}

	
	@Test
	void testMultiplyWithZero( ) {
		assertEquals(0, calculator.multiply(0, 5),"multiply by zero is zero");
		assertEquals(0, calculator.multiply(5, 0),"multiply by zero is zero");
	}

}
