package week8.day1;

import org.openqa.selenium.StaleElementReferenceException;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int[] num = { 10, 20, 30 };

		int z;
		try {
			z = x / y;
			System.out.println(z);
			try {
				System.out.println(num[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("End of program");

	}

}
