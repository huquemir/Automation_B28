package com.smarttechqa.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.mongodb.assertions.Assertions;
import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.Assertion;

public class LoginStepDefinition extends BaseClass {
	
	@Given("User opens the browser")
	public void user_opens_the_browser() throws InterruptedException, IOException {
		BaseClass.setUp();
	    
	}

	@Given("User navigates to {string}")
	public void user_navigates_to(String string) {
	    
	    
	}

	@When("User clicks on the Sign In button")
	public void user_clicks_on_the_sign_in_button() {
		driver.findElement(By.xpath("//a[@href='/login']")).click(); //This is going to the login page
		//driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
	}

	@When("User Enters the email")
	public void user_enters_the_email() throws IOException {
		//driver.findElement(By.id("email")).sendKeys("testuser@email.com");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testuser@email.com"); //Sending the email address
		Utilities.getHighLighter(driver.findElement(By.xpath("//*[@type='email']")));
		Utilities.takeScreenShot();
	}

	@When("User Enters the password")
	public void user_enters_the_password() {
		driver.findElement(By.id("password")).sendKeys("123456");
		//driver.findElement(By.cssSelector("#password")).sendKeys("123456");
	    
	}

	@When("User clicks on the login in button")
	public void user_clicks_on_the_login_in_button() {
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	}

	@Then("The user is successfully logged in and username is displayed")
	public void the_user_is_successfully_logged_in_and_username_is_displayed() {
	    //This step is used for Verification
		//We have to match the Expected with the Acatual
		
		//For Expected already know the username, so we can store it in a String
		String expected = "TEST USER";
		String actual = driver.findElement(By.id("username")).getText();
		
		//Use the Assert class from TestNG. There are static methods in the Assert class.
		//One of the static methods is assertEquals
		Assert.assertEquals(actual, expected);
		
		
	    
	}
	
	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("The title of the application is : "+driver.getTitle()); //To verify if you logged in 
	    
	}
	
	@When("User clicks on the Search Box and Searches for {string}")
	public void user_clicks_on_the_search_box_and_searches_for(String item) {
		Utilities.getExplicitWait(driver.findElement(By.name("q")), 10);
		driver.findElement(By.name("q")).sendKeys(item); //Sends keys to the searchbox
	    
	}

	@When("User clicks on the Search Button")
	public void user_clicks_on_the_search_button() {
		//driver.findElement(By.cssSelector(".p-2 btn btn-outline-success")).click();
		//driver.findElement(By.xpath("//*[text()='Search']")).click();
		driver.findElement(By.name("q")).submit();
	    
	}

	@Then("User can search for the {string} item")
	public void user_can_search_for_the_item(String string) {
	    
	    
	}

	@When("User clicks on the latest product from the homepage")
	public void user_clicks_on_the_latest_product_from_the_homepage() {
	    
	    
	}

	@Then("User is able to view the item")
	public void user_is_able_to_view_the_item() {
	    //
	    
	}
	
	
	@When("User clicks on the cart button")
	public void user_clicks_on_the_cart_button() {
		Utilities.getExplicitWait(driver.findElement(By.xpath("//a[@href='/cart']")),5);
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
	    
	}

	@Then("User is navigated to the Cart Page")
	public void user_is_navigated_to_the_cart_page() {
	    
	    
	}
	
	@Then("I can validate user payment")
	public void i_can_validate_user_payment() {
	   
	}
	
	@Then("I want to check user is able to pay for the item")
	public void i_want_to_check_user_is_able_to_pay_for_the_item() {
	    
	    
	}
	

}
