package week8.day1;

import java.io.IOException;

public class LearnThrow {
	
	public int divide(int num1, int num2) {
		int result = 0;
		if(num1 < num2) {
			throw new ArithmeticException("Invalid input: num1 is less than num2");
		}else {
			result = num1 / num2;
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		LearnThrow lt = new LearnThrow();
		
		int res;
		try {
			res = lt.divide(5,10);
			System.out.println(res);
		} catch (Exception e) {
			res = lt.divide(10,5);
			System.out.println(res);
			
		}
		finally {
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
			System.out.println("Finally code");
		}
		
		System.out.println("End of program");

	}

}
