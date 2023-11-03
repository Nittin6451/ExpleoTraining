package com.bddframework.Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
 
public class HookClass {
	@Before
	public void setup() {
		HelperClass.setUpDriver();
	}
	
//	@After
//	public void teardown() {
//		OhrmBase.tearDown();
//	}
}
 