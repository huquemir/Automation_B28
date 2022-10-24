package com.smarttechqa.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDef extends BaseClass {
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@When("User clicks on the first item")
	public void user_clicks_on_the_first_item() {
	    
	    
	}

	@When("User selects the quantity")
	public void user_selects_the_quantity() {
	    
	    
	}

	@When("User clicks on Add to Cart button")
	public void user_clicks_on_add_to_cart_button() {
	    
	    
	}

	@Then("the correct quantity is displayed")
	public void the_correct_quantity_is_displayed() {
	    
	    
	}

	@Given("User clicks on the profile")
	public void user_clicks_on_the_profile() {
	    
	    
	}

	@When("User hovers over their profile")
	public void user_hovers_over_their_profile() {
	    
	    
	}

	

}
