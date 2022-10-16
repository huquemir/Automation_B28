package com.smarttechqa.hooks;

import com.smarttechqa.basepage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook extends BaseClass {
	//Initialize starts the browser before every scenario
	@Before
	public static void initialize() {
		BaseClass.setUp();
		
	}
	
	//tearDown will quit the browser after every scenario
	@After
	public static void tearDown() {
		driver.quit();
		
	}

}
