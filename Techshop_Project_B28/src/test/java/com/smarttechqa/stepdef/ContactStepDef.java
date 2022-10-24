package com.smarttechqa.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDef extends BaseClass {
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@When("User clicks on the Contact Us Page")
	public void user_clicks_on_the_contact_us_page() {
	    
	    
	}

	@When("User clicks on Monday and Tuesday selection")
	public void user_clicks_on_monday_and_tuesday_selection() {
	    
	    
	}

	@Then("Monday and Tuesday are selected")
	public void monday_and_tuesday_are_selected() {
	    
	    
	}

	@When("User clicks on Morning and Afternoon checkboxes")
	public void user_clicks_on_morning_and_afternoon_checkboxes() {
	    
	    
	}

	@Then("Morning and Afternoon checkboxes are selected")
	public void morning_and_afternoon_checkboxes_are_selected() {
	    
	    
	}

	@Then("Evening checkbox is not selected")
	public void evening_checkbox_is_not_selected() {
	    
	    
	}

	@When("User opens a new tab window")
	public void user_opens_a_new_tab_window() {
	    
	    
	}

	@Then("User switches to the new tab window and close and switch back to the old tab")
	public void user_switches_to_the_new_tab_window_and_close_and_switch_back_to_the_old_tab() {
	    
	    
	}


}
