package com.bddframework.Cucumber;

import org.openqa.selenium.support.PageFactory;

public class HomePageAction {

		HomePageLocator homepage = null;
		
		public HomePageAction() {
			homepage = new HomePageLocator();
			PageFactory.initElements(HelperClass.getDriver(), homepage);
		}
		public String getText() {
			return homepage.Homepagetext.getText();
		}
}
