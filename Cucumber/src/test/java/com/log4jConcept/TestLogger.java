package com.log4jConcept;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLogger {
	
	public static WebDriver driver;
	public static org.apache.logging.log4j.Logger Log;
	
	public static void main(String[] args) {
		
		Log=LogManager.getLogger(TestLogger.class);
		
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Log.info("Using impliciltyWait");
		driver.get("https://www.google.com/");
		Log.info("Logged into google");
		
		try {
			boolean text = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Log.error("Exception occured",new Exception("element Not Found"));
		}
		finally {
			driver.quit();
			Log.info("Quitting the driver");
		}
		
	}

}
