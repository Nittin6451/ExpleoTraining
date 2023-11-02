package com.bddframework.Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class HookClass {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	@After
	public static void tearDow(Scenario scenario) {
		HelperClass.tearDown();
	}

}