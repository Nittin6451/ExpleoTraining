package com.bddframework.Cucumber;

import org.testng.Assert;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginPageFeature {
	LoginPageAction LoginOhrmActions = new LoginPageAction();
	HomePageAction HomepageOhrmActions = new HomePageAction();
	LoginUtil obj = new LoginUtil();
	@Given("user on homepage")
	public void user_on_homepage() {
		System.out.println("url is "+obj.strUrl);
		HelperClass.openPage(obj.strUrl);
	}
 
	@When("user enter id")
	public void user_enter_id() {
		LoginOhrmActions.login(obj.strUserName);
	}
 
	@When("enters pass")
	public void enters_pass() {
		LoginOhrmActions.loginpwd(obj.strPassword);
	}
 
	@When("click login")
	public void click_login() {
		LoginOhrmActions.clickLogin();
	}
 
	@Then("navigates to homepage")
	public void navigates_to_homepage() {
		Assert.assertEquals(HomepageOhrmActions.dashboardTxt(),"Dashboard");
	}
 
}