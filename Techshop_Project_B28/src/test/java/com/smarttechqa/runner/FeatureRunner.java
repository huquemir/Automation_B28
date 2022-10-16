package com.smarttechqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/NegativeTestingLogin.feature","Features/Login.feature"},
		glue = {"com.smarttechqa.stepdef","com.smarttechqa.hooks"}, 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
		//tags = "@smoke"
			
		)
public class FeatureRunner extends AbstractTestNGCucumberTests {

	
	
}
