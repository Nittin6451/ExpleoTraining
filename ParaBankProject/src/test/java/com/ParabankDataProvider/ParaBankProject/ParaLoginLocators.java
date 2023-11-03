package com.ParabankDataProvider.ParaBankProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParaLoginLocators {

	
		@FindBy(name = "username")
		WebElement Username;
		
		@FindBy(name = "password")
		WebElement Password;
		
		@FindBy(xpath = "//input[@value='Log In']")
		WebElement Loginbutton;
		
		@FindBy(className = "title")
		WebElement Confirmationmessage;
		
		@FindBy(className = "error")
		WebElement Errormessage;
}
