package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
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
		
	   // driver.findElement(By.partialLinkText("/SFA")).click();
		
		// Verify if the landing page is correct
		// My Home | opentaps CRM 
		
		String title = "My Home | opentaps CRM";
		String homeTitle = driver.getTitle();
		
		if(title.equals(homeTitle)) {
			System.out.println(" In the Home Page");
		}
		else
			System.out.println(" Not in the Home page");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
