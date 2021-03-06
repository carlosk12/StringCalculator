package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	 
	 @Test
	 public void testEmptyString() {
	 	assertEquals(0, Calculator.add(""));
	 }

	 @Test
	 public void testOneNumber() {
	 	assertEquals(1, Calculator.add("1"));
	 	assertEquals(2, Calculator.add("2"));
	 }

	 @Test
	 public void testTwoNumbers() {
	 	assertEquals(3, Calculator.add("1,2"));
	 }

	 @Test
	 public void testXNumbers() {
	 	assertEquals(6, Calculator.add("1,2,3"));
		assertEquals(10, Calculator.add("1,2,3,4"));
		assertEquals(28, Calculator.add("1,2,3,4,5,6,7"));
	 }

	 @Test
	 public void testNewLineDelimiter() {
	 	assertEquals(6, Calculator.add("1\n2,3"));
	 }
}