package calculator_testcases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import calculator.StringCalculator;

public class CalculatorTest {
	
	//TODO: For Empty String It Will return 0;
	
	@Test(description="Testing For Empty String")
	public void emptyStringChecker() {
		Assert.assertEquals(0,StringCalculator.add(""));
	}
	
	//TODO: For the addition of Single Number in String it will return same number;
	
	@Test(description="Testing for the addition of Single Number")
	public void oneNumberAdditions() {
		Assert.assertEquals(1,StringCalculator.add("1"));
	}
	
	//TODO: For the addition of two Number in String it will return sum of them;
	
	@Test(description="Testing for the addition of Multiple Numbers")
	public void twoNumberAdditions() {
		Assert.assertEquals(3,StringCalculator.add("1,2"));
	}
	
	
	//TODO: For the addition of multiple Numbers in String it will return sum of all of them;
	
	@Test(description="Testing for the addition of Multiple Numbers")
	public void multipleNumberAdditions() {
		Assert.assertEquals(6,StringCalculator.add("1,2,3"));
	}
	
	//TODO: For the addition of alphanumeric values in a String it will return sum of all of them;
	
	@Test(description="Testing for the addition of multiple Numbers and Alphabets")
	public void numberAlphabetsAdditions() {
		Assert.assertEquals(9,StringCalculator.add("1,2,3,a,b"));
	}
	
	//TODO: Throw exception for negative numbers;
	
	@Test(description="Throws error if negative number exists in input string")
	public void throwingNegativeNumberErrors() {
		try {
			StringCalculator.add("1,2,3,-4");
			fail("Exception expected");
		}catch(RuntimeException e) {
			Assert.assertEquals("negatives not allowed: -4",e.getMessage());
		}
	}
	
	//TODO: Exception message should have negative number;
	
	@Test(description="Throws error if negative number exists in input string")
	public void throwingForMultipleNegativeNumberErrors() {
		try {
			StringCalculator.add("1,2,3,-4,-5");
		}catch(RuntimeException e) {
			Assert.assertEquals("negatives not allowed: -4 -5",e.getMessage());
		}
	}
}
