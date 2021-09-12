package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnGroups1 {

	@Test(groups= {"functional","smoke"})
	public void createLead() {
		System.out.println("create lead");
	//	throw new NoSuchElementException();
	}

	@Test(groups= "functional")
	public void editLead() {
		System.out.println("edit lead");

	}

	
}
