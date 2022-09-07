package calculator_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import calculator.StringCalculator;

public class CalculatorTest {
	
	
	@Test(description="Testing For Empty String")
	public void emptyStringChecker() {
		Assert.assertEquals(0,StringCalculator.add(""));
	}
	
	@Test(description="Testing for the addition of multiple Numbers")
	public void numberAdditions() {
		Assert.assertEquals(9,StringCalculator.add("4,2,3"));
	}
}
