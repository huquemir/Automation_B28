package com.smarttechqa.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.elements.ElementPage;
import com.smarttechqa.utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDef extends BaseClass {
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@When("User clicks on the first item")
	public void user_clicks_on_the_first_item() throws InterruptedException {
	   //This step is going to handle the dynamic elements/objects
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@class='my-3 p-3 rounded card']"));
	    for (int i = 0; i<element.size(); i++) {
	    	if (i>=0) {
	    		element.get(i).click();
	    		break; //break will break out of the loop once it finds the element
	    		//Another keyword is called continue which "skips" the element. 
	    	}
	    }
	    
	    Thread.sleep(5000);
	    
	    //Utilities.clickDynamicElement(driver.findElements(By.xpath("//*[@class='my-3 p-3 rounded card']")), 0);
	}

	@When("User selects the quantity")
	public void user_selects_the_quantity() throws InterruptedException {
	    Select quantity = new Select(driver.findElement(By.xpath("//*[@class='form-control']")));
	    quantity.selectByIndex(2); 
	    
	    Thread.sleep(5000);
	}
	
	

	@When("User clicks on Add to Cart button")
	public void user_clicks_on_add_to_cart_button() {
	    
	    
	}

	@Then("the correct quantity is displayed")
	public void the_correct_quantity_is_displayed() {
	    
	    
	}

	@Given("User clicks on the profile")
	public void user_clicks_on_the_profile() {
	    driver.findElement(By.id("username")).click();
	    
	}

	@When("User hovers over their profile")
	public void user_hovers_over_their_profile() throws InterruptedException {
	    Actions hover = new Actions(driver);
	    hover.moveToElement(driver.findElement(By.linkText("Reports"))).build().perform();
	    Thread.sleep(5000);
	}

	/*
	@Then("User is able to hover over the profile")
	public void user_is_able_to_hover_over_the_profile() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
*/
}
