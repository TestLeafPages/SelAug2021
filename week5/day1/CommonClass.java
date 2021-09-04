package week5.day1;

import java.util.NoSuchElementException;

import org.testng.annotations.BeforeMethod;

public class CommonClass {
	
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("beforeMethod - common preCondition");
		
	}
	
	
}
