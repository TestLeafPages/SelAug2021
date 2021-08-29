package week4.day2;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://www.leafground.com/pages/table.html");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Step 1: find the table
		WebElement webTable = driver.findElement(By.id("table_id"));
		
		//Step 2: find the rows
		//  driver.findElements(By.tagName("tr"));  DONOT USE THIS
		List<WebElement> rowList = webTable.findElements(By.tagName("tr"));
		
		// To find the number of rows
		System.out.println(" Row count : " + rowList.size());
		
		// to find the number of columns
		// choose any one row
		// then get the count of the td tag
		
		
		WebElement webElement = rowList.get(1);
		List<WebElement> columnCount = webElement.findElements(By.tagName("td"));
		System.out.println(" Column count in that table:" + columnCount.size());
		
		
		// Display the whole content of the table
		// Display all the contents of all the rows
		for (WebElement eachRow : rowList) {
			String text = eachRow.getText();
			System.out.println(text);
		}
		
		
		// Display only the second column values (from all the rows)
		
		System.out.println("******  Column data ********");
		for (int i = 1; i < rowList.size(); i++) {
		// say i=1	- second row
			WebElement webElement2 = rowList.get(i);
			List<WebElement> allColumns = webElement2.findElements(By.tagName("td"));
			String text = allColumns.get(1).getText();
			System.out.println(text);
			
			// chnage the progres value to integer
			// add to the empty list
			
		}
		
		int num = 30;
		driver.findElement(By.xpath("//td[contains(text(),"+num+")]")).sendKeys(Keys.ENTER);
		
		String text = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td[1]")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
