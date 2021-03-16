package com.testingdocs.calculator.tests;


import com.testingdocs.calculator.Calculator;
import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;

public class CalculatorTest {
private Calculator objCalcUnderTest;

@Before
public void setUp() {

objCalcUnderTest = new Calculator();
}

@Test
public void testAdd() { 
int a = 29; int b = 45; 
int expectedResult = 74;
 
long result = objCalcUnderTest.add(a, b);

Assert.assertEquals(expectedResult, result);
}

@Test
public void testSubtract() {
int a = 75; int b = 25; 
int expectedResult = 50; 
long result = objCalcUnderTest.subtract(a, b);
Assert.assertEquals(expectedResult, result);
}

@Test
public void testMultiply() {
int a = 25 ; int b = 5 ;
long expectedResult = 125;
long result = objCalcUnderTest.multiply(a, b);
Assert.assertEquals(expectedResult, result);
}

@Test
public void testDivide() {
int a = 250; int b = 10; 
double expectedResult = 25; 
double result = objCalcUnderTest.divide(a, b);
Assert.assertEquals(expectedResult, result); 
}

@Test(expected = IllegalArgumentException.class)
public void testDivideByZero() { 
int a = 9; int b = 0;
objCalcUnderTest.divide(a, b);
} 
}


