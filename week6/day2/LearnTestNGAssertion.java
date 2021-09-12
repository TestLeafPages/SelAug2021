package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNGAssertion {

	@Test
	public void login() {
		
		//Leaftaps - TestLeaf Automation Platform
		String expTitle = "TestLeaf Automation Platform";

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		String actTitle = driver.getTitle();
		
		//create object for SoftAssert
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actTitle, expTitle);
		
		
		//Hard Assert
		//Assert.assertTrue(displayed);
		//Assert.assertFalse(displayed);
		//Assert.assertEquals(actTitle, expTitle);
		
		System.out.println("End of program");
		
		//Mandatory for SoftAssert
		softAssert.assertAll();
		
		
		
		
		
		
		
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("Title is matching"); }
		 * else { System.out.println("Title is not matching"); }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
