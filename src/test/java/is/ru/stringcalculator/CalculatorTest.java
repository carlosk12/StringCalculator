package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	 @Test
	 publicvoid testEmptyString() {
	 	assertEquals(0, Calculator.add(""));
	 }
}