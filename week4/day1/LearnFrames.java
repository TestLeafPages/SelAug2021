package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://www.leafground.com/pages/frame.html");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Switch into the frame
		WebElement frame1 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[1]/iframe"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
		// It takes me out of all the frames
		// It takes me to the main page
		driver.switchTo().defaultContent(); 
		// Has come out of the frame to the main page
		
		// NESTED FRAMES
		WebElement nestedFrame1 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[2]/iframe"));
		driver.switchTo().frame(nestedFrame1);
		driver.switchTo().frame("frame2");  // By id
		driver.findElement(By.id("Click1")).click(); // click the button
		driver.switchTo().defaultContent(); 
		
		// It takes the control to the previous frame
	//	driver.switchTo().parentFrame();
		
		// NESTED FRAMES - 2
		WebElement nestedFrame2 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[3]/iframe"));
		driver.switchTo().frame(nestedFrame2);
		
		driver.findElement(By.id("Click1")).click(); // click the button
		driver.switchTo().defaultContent(); 
		
		// FRAME 3 : Will be an assignment to count the number of frames
		
		
		
		
		
		
		
	}

}
