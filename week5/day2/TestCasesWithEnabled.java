package week5.day2;

import org.testng.annotations.Test;

public class TestCasesWithEnabled {
	
	
	
	@Test
	public void createLead() {
		System.out.println("create lead");

	}
	
	@Test
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test(enabled = true)
	public void deleteLead() {
		System.out.println("delete lead");

	}

}
