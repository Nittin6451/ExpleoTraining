package com.ParabankDataProvider.ParaBankProject;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class RegisterHookClass {

	@Before
	public void setup() {
		RegisterHelperClass.setUpDriver();
	}
	
//	@After
//	public void teardown() {
//		OhrmBase.tearDown();
//	} 
			
	}