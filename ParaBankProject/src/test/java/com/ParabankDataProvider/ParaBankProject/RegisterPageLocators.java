package com.ParabankDataProvider.ParaBankProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	@FindBy(id ="customer.firstName")
	WebElement firstname;
	
	@FindBy(id = "customer.lastName")
	WebElement lastname;
	
	@FindBy(id = "customer.address.street")
	WebElement address;
	
	@FindBy(id = "customer.address.city")
	WebElement city;
	
	@FindBy(id = "customer.address.state")
	WebElement state;
	
	@FindBy(id = "customer.address.zipCode")
	WebElement zipcode;
	
	@FindBy(id = "customer.phoneNumber")
	WebElement phonenumber;
	
	@FindBy(id = "customer.ssn")
	WebElement ssn;
	
	@FindBy(id = "customer.username")
	WebElement username;
	
	@FindBy(id = "customer.password")
	WebElement password;
	
	@FindBy(id = "repeatedPassword")
	WebElement confirmpassword;
	
	@FindBy(xpath = "//input[@value='Register']")
	WebElement registerbutton;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/p")
	WebElement confirmmsg;
	
	@FindBy(xpath ="//a[@href='/parabank/logout.htm']")
	WebElement Logout;
}
