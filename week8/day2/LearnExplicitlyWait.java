package week8.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/disapper.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='btn']/b"));
		
		//create object for WebDriverWait
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
		/*
		 * Wait wait = new FluentWait(driver) .withTimeout(Duration.ofSeconds(5))
		 * .pollingEvery(Duration.ofMillis(250)) .ignoring(Exception.class);
		 */
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
		wait.until(ExpectedConditions.invisibilityOf(ele));
		
		String text = driver.findElement(By.tagName("strong")).getText();
		System.out.println(text);
		
		
	}

}
