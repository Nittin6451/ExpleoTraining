package CucumberPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {
	

	WebDriver driver;
	@Before
	public void beforemethod() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	@Given("user is on the Web page {string}")
	public void user_is_on_the_web_page(String url) {
		driver.get(url);
	    
	}
	@When("User enters the Username as {string}")
	public void user_enters_the_username_as(String username) {
		 driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("User enters the Password as {string}")
	public void user_enters_the_password_as(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@When("User Clicks the Login")
	public void user_clicks_the_login() {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}


	@Then("user is navigated to Homepage")
	public void user_is_navigated_to_homepage() {
		 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Then("User should be able to Login Successfully")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("Login Successfull");
	}  

}
