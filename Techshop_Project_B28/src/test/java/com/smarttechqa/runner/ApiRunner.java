package com.smarttechqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/ProductsApi.feature"},
		plugin = {"pretty","json:target/cucumber.json"},
		glue = {"com.smarttechqa.apistepdef"},
		monochrome = true
		)

public class ApiRunner extends AbstractTestNGCucumberTests {
	
	

}

