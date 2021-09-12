package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
		
	@Then("Homepage should be displayed")
	public void verifyHomepage() {

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
		
	@When("Click on {string} link")
	public void clickLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	
	@Then("{string} Page should be displayed")
	public void verifyPage(String pageName) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	
	
	
	

}
