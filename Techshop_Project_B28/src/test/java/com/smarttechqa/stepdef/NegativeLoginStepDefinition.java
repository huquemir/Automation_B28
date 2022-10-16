package com.smarttechqa.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.*;


public class NegativeLoginStepDefinition extends BaseClass {
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@Given("I open the browser and I navigate to the application")
	public void i_open_the_browser_and_i_navigate_to_the_application() throws InterruptedException, IOException {
		//BaseClass.setUp();
	    
	}

	@When("I click on the sign in button on homepage")
	public void i_click_on_the_sign_in_button_on_homepage() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	    
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String email, String password) {
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	    
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	}

	@Then("I am suppose to get an error message")
	public void i_am_suppose_to_get_an_error_message() {
	    
	    
	}

}
