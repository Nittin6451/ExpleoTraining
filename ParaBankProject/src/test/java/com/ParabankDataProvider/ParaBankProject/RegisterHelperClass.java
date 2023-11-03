package com.ParabankDataProvider.ParaBankProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterHelperClass {
	private static RegisterHelperClass helperclass;
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT = 20;
	
	RegisterHelperClass(){
		driver = new EdgeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	
	public static void openPage(String strurl) {
		driver.get(strurl);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(helperclass==null) {
			helperclass = new RegisterHelperClass();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		
		helperclass = null;
	}
 
}
