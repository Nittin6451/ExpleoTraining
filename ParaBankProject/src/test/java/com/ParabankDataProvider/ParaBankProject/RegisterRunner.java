package com.ParabankDataProvider.ParaBankProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\RegisterData.properties",glue ="com.ParabankDataProvider.ParaBankProject" )
public class RegisterRunner  {

}
