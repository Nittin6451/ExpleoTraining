package com.bddframework.Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAction {
	
	LoginPageLocators loginPageLocators=null;
	String strUsername, strPassword,strURL;
	WebDriver driver;
	 
	public LoginPageAction() {
		loginPageLocators = new LoginPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
	}
	 
		
		public void setUserName(String strUserName) {
		loginPageLocators.username.sendKeys(strUserName);
	}
		public void setPassword(String strPassword) {
		loginPageLocators.password.sendKeys(strPassword);
	}
		public void clickLogin() {
			loginPageLocators.loginbuttton.click();
		}

		public void loginInfo(String strUsername,String strPassword) {
			

			setUserName(strUsername);
			setPassword(strPassword);
			
		}
		
	
	}

