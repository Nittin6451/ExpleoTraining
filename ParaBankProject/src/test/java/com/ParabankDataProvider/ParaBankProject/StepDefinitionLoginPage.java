package com.ParabankDataProvider.ParaBankProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionLoginPage {
	
	WebDriver driver;
    ParaLoginAction login = new ParaLoginAction();
	@Before
	public void beforemethod() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@Given("User is the on the Login Page {string}")
	public void user_is_the_on_the_login_page(String url) {
	  driver.get(url);
	}

	@When("User enters the Parausername {string}")
	public void user_enters_the_parausername(String username) {
	   login.setUsername(username);
	}

	@When("User enters the Parapassowrd {string}")
	public void user_enters_the_parapassowrd(String password) {
	   login.setPassword(password);
	}
	@Then("User clciks the Login")
	public void user_clciks_the_login() {
	   login.getLoginButton();
	}
	@Then("User gets the Confiramtion Message")
	public void user_gets_the_confiramtion_message() {
	   Assert.assertEquals(login.getConfirmationmessage(),"Accounts Overview" );
	}


	@When("User enters the invalidusername {string}")
	public void user_enters_the_invalidusername(String invalidusername) {
	    login.setUsername(invalidusername);
	}

	@When("user enters the invalidpassword {string}")
	public void user_enters_the_invalidpassword(String invalidpassword) {
	   login.setUsername(invalidpassword);
	}
	@Then("User clciks the Loginbutton")
	public void user_clciks_the_loginbutton() {
		login.getLoginButton();
	}
	
	@Then("User gets the Error Message")
	public void user_gets_the_error_message() {
		 Assert.assertEquals(login.getErrormessage(),"An internal error has occurred and has been logged." );
	}


}
