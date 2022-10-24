package com.smarttechqa.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportingStepDef extends BaseClass {
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@Given("User clicks on Reports button")
	public void user_clicks_on_reports_button() {
	    
	    
	}

	@When("User uploads a file")
	public void user_uploads_a_file() {
	    
	    
	}

	@Then("The attribute {string} is displayed")
	public void the_attribute_is_displayed(String string) {
	    
	    
	}

	@When("User clicks on Upload button")
	public void user_clicks_on_upload_button() {
	    
	    
	}

	@When("User Enters Name and User clicks on Ok button")
	public void user_enters_name_and_user_clicks_on_ok_button() {
	    
	    
	}

	@Then("Message {string} is displayed")
	public void message_is_displayed(String string) {
	    
	    
	}

	@When("User cancels the alert")
	public void user_cancels_the_alert() {
	    
	    
	}

	@Then("Message {string} is displayed on screen")
	public void message_is_displayed_on_screen(String string) {
	    
	    
	}

}
