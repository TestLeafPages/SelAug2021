package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnGroups2 {

	
	@Test(groups= "regression", dependsOnGroups = "smoke")
	public void deleteLead() {
		System.out.println("delete lead");

	}

}
