package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("https://jqueryui.com/sortable/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		Point location = item5.getLocation(); 
		int x = location.getX();
		int y = location.getY();
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();

		
	
	}

}
