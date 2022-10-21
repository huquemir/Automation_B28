package com.smarttechqa.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchItemsStepDefinition extends BaseClass {

	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	

	@When("User enters the keywords {string}")
	public void user_enters_the_keywords(String airpod) {
		pf.getSearch().sendKeys(airpod);
	    
	}

	@When("The user clicks on the Search button")
	public void the_user_clicks_on_the_search_button() {
		//pf.getSearch().submit();
	    pf.getSearchButton().click();
	    
	}

	@When("The user clicks on the item")
	public void the_user_clicks_on_the_item() {
	    pf.getAirpods().click();
	    
	}

	@Then("The user is navigated to the {string} item page")
	public void the_user_is_navigated_to_the_item_page(String string) {
	    String expected = "AIRPODS WIRELESS BLUETOOTH HEADPHONES";
		String actual = pf.getAirpodsPage().getText();
		Assert.assertEquals(actual, expected);
	    
	}

	
}
