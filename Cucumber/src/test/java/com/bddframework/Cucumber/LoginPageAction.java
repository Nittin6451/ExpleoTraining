package com.bddframework.Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 
public class LoginPageAction {
	WebDriver driver;
	LoginPageLocators LoginOhrmLocators = null;
	String url,username,password;
	
	public LoginPageAction() {
		this.LoginOhrmLocators = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), LoginOhrmLocators);
	}
	
	public void setUserName(String username) {
		LoginOhrmLocators.user.sendKeys(username);
	}
	
	public void setPassword(String password) {
		LoginOhrmLocators.password.sendKeys(password);
	}
	
	public void clickLogin() {
		LoginOhrmLocators.loginButton.click();
	}
	
	public void login(String strUserName) {
		setUserName(strUserName);
		
	}
	public void loginpwd(String strPassword) {
		setPassword(strPassword);
	}
}
