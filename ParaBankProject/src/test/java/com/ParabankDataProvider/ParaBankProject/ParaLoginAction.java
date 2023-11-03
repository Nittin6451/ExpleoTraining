package com.ParabankDataProvider.ParaBankProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParaLoginAction {

	WebDriver driver;
	
	ParaLoginLocators locators = null;
	
	public ParaLoginAction() {
		this.locators= new ParaLoginLocators();
		PageFactory.initElements(RegisterHelperClass.getDriver(), locators);
	}
	
	public void setUsername(String username) {
		locators.Username.sendKeys(username);
	}
	public void setPassword(String password) {
		locators.Password.sendKeys(password);
	}
	public void getLoginButton() {
		locators.Loginbutton.click();
	}
	public String getConfirmationmessage(){
		return locators.Confirmationmessage.getText();
	}
	public String getErrormessage() {
		return locators.Errormessage.getText();
	}
	
}
