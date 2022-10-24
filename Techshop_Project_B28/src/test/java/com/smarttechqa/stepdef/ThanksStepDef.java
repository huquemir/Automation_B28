package com.smarttechqa.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.When;

public class ThanksStepDef extends BaseClass {
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@When("User clicks on the Submit button on contacts page")
	public void user_clicks_on_the_submit_button_on_contacts_page() {
	    
	    
	}

	@When("User drag and drops an item")
	public void user_drag_and_drops_an_item() {
	    
	    
	}

	@When("User switches to the iframe and clicks on the zoom in button")
	public void user_switches_to_the_iframe_and_clicks_on_the_zoom_in_button() {
	    
	    
	}


}
