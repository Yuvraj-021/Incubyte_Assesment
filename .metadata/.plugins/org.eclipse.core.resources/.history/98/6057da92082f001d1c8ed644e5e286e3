package calculator;

import java.util.*;
import java.lang.*;



public class StringCalculator {
	
	// Function: For doing various calculations using string .
	
	public static int add(String numbers) {
		int result=0;
		if(numbers.length()==0)
			return result;
		String[] splitted_string=numbers.split(",");

		for(int index=0;index<splitted_string.length;index++) {
			// condition for checking if the current index element is char or not.
			if(splitted_string[index].matches("[a-z]")) {
				result += getNumericValueOfAlphabet(splitted_string[index]);
			}
			else {
				result += Integer.parseInt(splitted_string[index]);
			}
		}
		return result;
	}

	private static int getNumericValueOfAlphabet(String s) {
		return s.charAt(0) - 96;
	}
}
