package com.bddframework.Cucumber;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageFeature {
	
	LoginPageAction objLogin = new LoginPageAction();
	HomePageAction objHome = new HomePageAction();
	LoginUtil util = new LoginUtil();
	
	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
	   HelperClass.openPage(util.StrUrl);
	}

	@When("User enters username , password and clicks login")
	public void user_enters_username_password_and_clicks_login() {
		objLogin.loginInfo(util.strUserName, util.strPassword);
	}

	@Then("User should be able to Login Successfully and Home page opens")
	public void user_should_be_able_to_login_successfully_and_home_page_opens() {
		 Assert.assertTrue(objHome.getText().contains("Dashboard"));
	}


	

}
