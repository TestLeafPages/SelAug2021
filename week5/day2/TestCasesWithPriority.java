package week5.day2;

import org.testng.annotations.Test;

public class TestCasesWithPriority {
	
	//createLead ; editLead ; deleteLead
	//all the attributes in TestNG are methods
	@Test(priority = -1)
	public void login() {
		System.out.println("log in");

	}
	
	@Test(priority = 1)
	public void createLead() {
		System.out.println("create lead");

	}
	
	@Test
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("delete lead");

	}

}
