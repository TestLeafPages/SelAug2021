package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {

		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		// Step 3: Load the URL
/*		driver.get("http://www.leafground.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/seat1.png");
		FileUtils.copyFile(src1, dst); */
		
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement goToHome = driver.findElement(By.id("home"));
		
		File src1 = goToHome.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/button.png");
		FileUtils.copyFile(src1, dst);
		
		
		
		
		
		
		

	}

}
