package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://www.leafground.com/pages/selectable.html");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions builder = new Actions(driver);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		builder.clickAndHold(item1).moveToElement(item5).release().perform();
		
		
	}

}
