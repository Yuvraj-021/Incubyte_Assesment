package calculator;

import java.util.*;
import java.lang.*;



public class StringCalculator {
	
	//Function: For getting the character corresponding value in integer.
	
	private static int getNumericValueOfAlphabet(String s) {
		return s.charAt(0) - 96;
	}

	// Function: For Appending negative Values and message .
	
	private static void createErrorMessage(List<Integer> negative_numbers) {
		String message="Negatives not allowed";
		String negativenumbers="";
		int end=negative_numbers.size() - 1;
		for (int index = 0; index < end; index++) {
			negativenumbers += negative_numbers.get(index)+ " ";
		  }
		negativenumbers += negative_numbers.get(end);
		throw new RuntimeException("negatives not allowed: " + String.join(", ",negativenumbers));
	}

	
	// Function: For doing various calculations using string .
	
	public static int add(String numbers) {
		int result=0;
		
		//returning result if string is empty.
		if(numbers.length()==0)
			return result;
		
		String[] splitted_string=numbers.split(",");
		
		// maintaining two lists for storing negative numbers and integers for summations
		List<Integer> negative_numbers=new ArrayList<Integer>(); 
		List<Integer> string_summation=new ArrayList<Integer>();

		for(int index=0;index<splitted_string.length;index++) {
			// condition for checking if the current index element is char or not.
			if(splitted_string[index].matches("[a-z]")) {
				string_summation.add(getNumericValueOfAlphabet(splitted_string[index])); 
			}
			else {
				int temp = Integer.parseInt(splitted_string[index]);
			      if (temp < 0) {
			    	  negative_numbers.add(temp);
			      }
			      else {
			    	  string_summation.add(temp);
			      }
			}
		}
		if(negative_numbers.size()>0)
			createErrorMessage(negative_numbers);
		
		// summation of integers.
		for (int index = 0; index < string_summation.size(); index++) {
			result += string_summation.get(index);
		}
		return result;
	}







	
}
