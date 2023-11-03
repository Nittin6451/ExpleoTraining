package com.ParabankDataProvider.ParaBankProject;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionOfRegister {
	
	RegisterPageAction register = new RegisterPageAction();
	RegisterUtility utility = new RegisterUtility();
	
	@Given("User is on the para bank register page")
	public void user_is_on_the_para_bank_register_page() {
	   System.out.println("url");
	   RegisterHelperClass.openPage(utility.strurl);
	}

	@When("User enters the Firstname")
	public void user_enters_the_firstname() {
	   System.out.println("firstname");
	   register.setFirstname(utility.strfirstname);
	}

	@When("user enters the Lastname")
	public void user_enters_the_lastname() {
		 System.out.println("lastname");
		   register.setLastname(utility.strlastname);
	}

	@When("user enters the Address")
	public void user_enters_the_address() {
		 System.out.println("address");
		   register.setAddress(utility.straddress);
	}

	@When("user enters the City")
	public void user_enters_the_city() {
		 System.out.println("city");
		   register.setCity(utility.strcity);
	}

	@When("user enters the State")
	public void user_enters_the_state() {
		 System.out.println("state");
		   register.setState(utility.strstate);
	}

	@When("user the enters the Zip code")
	public void user_the_enters_the_zip_code() {
		 System.out.println("zipcode");
		   register.setZipcode(utility.strzipcode);
		   
	}

	@When("user the enters the Phone number")
	public void user_the_enters_the_phone_number() {
		System.out.println("phonenumber");
		   register.setPhoneNumber(utility.strphonenumber);
	}

	@When("user the enters the SSN number")
	public void user_the_enters_the_ssn_number() {
		System.out.println("ssn");
		   register.setSSN(utility.strssn);
	}

	@When("user the enters the Username")
	public void user_the_enters_the_username() {
		System.out.println("username");
		   register.setUsername(utility.strusername);
	}

	@When("user the enters the Passowrd")
	public void user_the_enters_the_passowrd() {
		System.out.println("password");
		   register.setPassword(utility.strpassword);
	}

	@When("user the enters the Passowrd Confirm")
	public void user_the_enters_the_passowrd_confirm() {
		System.out.println("confirmpassword");
		   register.setConfirmPassword(utility.strconfirmpassword);
	}

	@When("user clicks the Register")
	public void user_clicks_the_register() {
		System.out.println("click");
		   register.getRegisterClick();
	   
	}
	@Then("user gets Confimation message")
	public void user_gets_confimation_message() {
	    Assert.assertEquals(register.getConfirmationmessage(),"Your account was created successfully. You are now logged in." );
	}
	@Then("user clicks Logout")
	public void user_clicks_logout() {
	    register.getLogout();
	}


}
