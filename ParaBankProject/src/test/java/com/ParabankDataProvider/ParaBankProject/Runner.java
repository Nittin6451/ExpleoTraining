package com.ParabankDataProvider.ParaBankProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags ="@ValidCredentials",features ="C:\\Users\\aricharddaniel\\eclipse-workspace\\ParaBankProject\\src\\test\\resources\\Feature\\ParaBank.feature",glue ="ParaBankProject",plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports/cucumber.html"})
public class Runner  {

}
