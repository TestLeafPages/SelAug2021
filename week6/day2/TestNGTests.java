package week6.day2;

import org.testng.annotations.Test;

public class TestNGTests {
							//packageName.ClassName.methodName
	@Test(dependsOnMethods = "week6.day2.LeafTapsTestCases.createLead")
	public void duplicatelead() {
		System.out.println("Duplicate Lead");

	}

}
