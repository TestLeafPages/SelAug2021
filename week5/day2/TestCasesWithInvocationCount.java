package week5.day2;

import org.testng.annotations.Test;

public class TestCasesWithInvocationCount {
	
	
	
	@Test(priority = -1, invocationCount = 3)
	public void createLead() {
		System.out.println("create lead");

	}
	
	@Test(priority = -1)
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("delete lead");

	}

}
