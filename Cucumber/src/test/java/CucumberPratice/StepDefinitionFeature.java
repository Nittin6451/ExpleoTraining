package CucumberPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFeature {
	
	WebDriver driver;
	
	@Before
	public void beforemethod() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Given("user is on the Login page {string}")
	public void user_is_on_the_login_page_https_opensource_demo_orangehrmlive_com(String url) {
		driver.get(url);
		
	}	  

	@When("User enters the username as {string}")
	public void user_enters_the_username_as_admin(String username) {
		 driver.findElement(By.name("username")).sendKeys(username);
	    
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	    
	}

	@When("User Clicks the Login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	   
	}
	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {	
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("Login Successfull");
	}
		
	@When("User enters the invaildusername as {string}")
	public void user_enters_the_invaildusername_as(String invalidusername) {
			driver.findElement(By.name("username")).sendKeys(invalidusername);;
		    
		}

	@When("User enters the invaildpassword as {string}")
		public void user_enters_the_invaildpassword_as(String invalidpassword) {
		    driver.findElement(By.name("password")).sendKeys(invalidpassword);
		}

	@Then("Login will be unsuccessfull")
		public void login_will_be_unsuccessfull() {
		
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='oxd-alert oxd-alert--error']")).isDisplayed());		   
		}

	@When("User enters the Blankusername as {string}")
		public void user_enters_the_blankusername_as(String blankusername) {
		driver.findElement(By.name("username")).sendKeys(blankusername);
		  
		}

	@When("User enters the Blankpassword as {string}")
		public void user_enters_the_blankpassword_as(String blankpassword) {
		driver.findElement(By.name("password")).sendKeys(blankpassword);
	}

	@Then("user gets a error message")
		public void user_gets_a_error_message() {
		   Assert.assertTrue(driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).isDisplayed());
		}
	   
	@After
	public void aftermethod() {
		driver.quit();
	}

}
