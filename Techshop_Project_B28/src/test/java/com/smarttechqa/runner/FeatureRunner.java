package com.smarttechqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/"},
		glue = {"com.smarttechqa.stepdef"},
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
			
		)
public class FeatureRunner extends AbstractTestNGCucumberTests {

	
	
}
