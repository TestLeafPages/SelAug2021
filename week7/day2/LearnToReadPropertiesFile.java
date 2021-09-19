package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToReadPropertiesFile {

	@Test
	public void runProperties() throws IOException {
		//step1: steup the path of the file
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		
		//step2: Create object for Properties class
		Properties prop = new Properties();
		
		//step3: load the properties file
		prop.load(fis);
		
		//step4: To read the value by passing the key
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		FileOutputStream fos = new FileOutputStream("./src/main/resources/config.properties");
		 prop.setProperty("username", "DemoCSR");
		 prop.store(fos, "updating username");
		
	/*
	 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.get(prop.getProperty("url"));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
	 * driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 * driver.findElement(By.linkText("Leads")).click();
	 * driver.findElement(By.linkText("Create Lead")).click();
	 * driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	 * driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98")
	 * ; driver.findElement(By.name("submitButton")).click(); String text =
	 * driver.findElement(By.id("viewLead_companyName_sp")).getText(); String
	 * replaceAll = text.replaceAll("\\D", "");
	 * 
	 * //steps to write the data in properties file FileOutputStream fos = new
	 * FileOutputStream("./src/main/resources/config.properties");
	 * prop.setProperty("leadId", replaceAll); prop.store(fos, null);
	 */
		
		
		
		
		
	}

}
