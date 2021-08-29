package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnKeyBoradControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		// Select all the contents in a page
		// KeyBoard _ cntrl + a
		// keyDown ( cntrl)
		// sendKeys (a)
		// keyUp(cntrl)
		
		
		Actions builder = new Actions(driver);
		
		builder.keyDown(Keys.CONTROL)
		       .sendKeys("a")
		       .keyUp(Keys.CONTROL)
		       .perform();
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
