package week8.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		FileInputStream fis = new FileInputStream("./data/cong.properties");
		
		Thread.sleep(2000);
		
		System.out.println("end of program");

	}

}
