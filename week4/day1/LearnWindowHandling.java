package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://www.leafground.com/pages/Window.html");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// waits for 10 secs to see if the element is in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("home")).click();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandlesSet);
		
		//windowHandlesList.get(1); // window handle of the child window
		driver.switchTo().window(windowHandlesList.get(1));
		System.out.println(driver.getTitle());
		
		// Main window - 0
		// child windows - 1
		
		// to get the number of windows 
		System.out.println("Number of windows:" + windowHandlesList.size());
		
		
		// getting back to my main window
		
	//	driver.switchTo().window(windowHandlesList.get(0));
		driver.switchTo().window("window");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
	}

}
