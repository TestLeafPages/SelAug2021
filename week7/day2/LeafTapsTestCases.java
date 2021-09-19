package week7.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
	@Test(timeOut = 500)
	public void createLead() throws InterruptedException {
		System.out.println("create Lead");
		int ranNum = (int) (Math.random()*1000);
		System.out.println(ranNum);
		Thread.sleep(ranNum);
		

	}
	
	@Test
	public void editLead() {
		System.out.println("edit Lead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("delete Lead");

	}

}
