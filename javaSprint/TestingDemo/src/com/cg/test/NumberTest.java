package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.cg.CheckNumber;

class NumberTest {

	
	private CheckNumber obj;
	
	
	@BeforeEach
	public void initialize() {
		obj=new CheckNumber();
		System.out.println("CheckNumber Object created");
	}
	
	@AfterEach
	public void destroy() {
		obj = null;
		System.out.println("CheckNumber object destroyed");
	}
	
	@Test
	void evenNumberTest() {
		assertEquals("Even", obj.checkEvenOrOdd(6));
		
		
	}
	
	@Test
	void oddNumberTest() {
		
		assertEquals("Odd", obj.checkEvenOrOdd(9));
	}
	
//	@Test
//	void primeTestWithTrueResult() {
//		assertTrue(obj.checkPrimeOrNot(5));
//	}
//	
//	@Test
//	void primeTestWithFalseResult() {
//		assertFalse(obj.checkPrimeOrNot(15));
//	}
	
	@ParameterizedTest
	@MethodSource("provideParameter")
	void primeTest(int data,boolean result) {
		assertEquals(result, obj.checkPrimeOrNot(data));
	}
	
	public static Collection provideParameter(){
		return Arrays.asList(new Object[][] {{2,true},{3,true},{6,false},{5,true},{22,false}});
	}

}
