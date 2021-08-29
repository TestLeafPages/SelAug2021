package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.xpath("//label[text()='Username']"));
		
		Actions builder = new Actions(driver);
		//builder.doubleClick();
		builder.doubleClick(userName).perform();
		builder.contextClick().perform();
		
		
		
		
		
		
	}

}
