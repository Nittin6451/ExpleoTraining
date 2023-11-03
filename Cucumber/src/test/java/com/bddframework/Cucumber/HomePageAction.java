package com.bddframework.Cucumber;

import org.openqa.selenium.support.PageFactory;

public class HomePageAction {
	HomePageLocator HomepageOhrmLocators = null;
	
	public HomePageAction() {
		this.HomepageOhrmLocators = new HomePageLocator();
		PageFactory.initElements(HelperClass.getDriver(), HomepageOhrmLocators);
	}
	
	public String dashboardTxt() {
		return HomepageOhrmLocators.dashboardText.getText();
	}
}
 