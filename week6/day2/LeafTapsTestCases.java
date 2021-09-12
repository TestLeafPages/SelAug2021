package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
	
	@Test
	public void createLead() {
		System.out.println("create lead");
		throw new NoSuchElementException();

	}

	@Test(dependsOnMethods = "createLead", alwaysRun = true)
	public void editLead() {
		System.out.println("edit lead");

	}
	
	/*
	 * @Test(dependsOnMethods = {"createLead","editLead"}) public void deleteLead()
	 * { System.out.println("delete lead");
	 * 
	 * }
	 */
}
