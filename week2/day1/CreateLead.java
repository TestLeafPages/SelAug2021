package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path
				WebDriverManager.chromedriver().setup();
				// Step 2: Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();
				// Step 3: Load the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				// Step 4: Maximise the window
				driver.manage().window().maximize();
				
				// waits for 10 secs if the element is not in the DOM
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				// for version from alpha -7 
				// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
				
				// Step 5: Locate the Username and enter the username as demosalesmanager
				WebElement webUser = driver.findElement(By.id("username"));
				webUser.sendKeys("demosalesmanager");
				
				// Step 6: Locate the password(webelement) and enter the password as crmsfa
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				// Step 7: Locate the Login button and click on it
				driver.findElement(By.className("decorativeSubmit")).click();
				
				// Step 8: Click on the crm/sfa link 
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				// Step10: Click Leads tab
				// link text = Leads
				driver.findElement(By.linkText("Leads")).click();
				
				// Step11: Click CreateLead
				// link Text = Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				// Step12: Enter Company name
				//id = createLeadForm_companyName
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
				// Step13: Enter FirstName
				//id = createLeadForm_firstName
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Radha");
				
				// Step14: Enter LastName
				//id= createLeadForm_lastName
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishna");
				
				//Step 15: Enter the country code
				// First, clear the text- clear()
				// Then use sendKeys()
				WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				countryCode.clear();
				countryCode.sendKeys("5");
				
				
				// Step15: Click CreateLead button
				// class = smallSubmit
				// name = submitButton
				// id = ext-gen616
				
				driver.findElement(By.name("submitButton")).click();
				
	}

}
