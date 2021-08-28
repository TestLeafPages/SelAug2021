package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://www.leafground.com/pages/Alert.html");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// SIMPLE ALERT
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();

		// Step 1: switch the control to the current active dialog
		// returns the current handle of the active dialog
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(" alert text:" + text);
		
	    //	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		// Throws UnhandledAlertException
	
		alert.accept(); // pressing OK button
		
		// CONFIRMATION ALERT

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);
		alert.dismiss();
		// verifying the text
		// Verify if OK or CANCEL button is clicked
		// If 
		// You pressed Cancel!
		// You pressed OK!
		
		
				
				
		// PROMPT ALERT
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("Edu");
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
