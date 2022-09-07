package calculator;



public class StringCalculator {
	
	// Function: For calculating the sum of numbers if present in the string, if not returning 0.
	
	public static int add(String numbers) {
		int result=0;
		if(numbers.length()==0)
			return result;
		String[] splitted_string=numbers.split(",");

		for(int index=0;index<splitted_string.length;index++) {
			result+=Integer.parseInt(splitted_string[index]);
		}
		return result;
	}
}
