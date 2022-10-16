package com.smarttechqa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarttechqa.basepage.BaseClass;

public class ElementPage extends BaseClass {
	
	public ElementPage(){
		PageFactory.initElements(driver, this);	
	}
	
	//How to store the elements 
	//Encapsulation in our framework. We want to make our elements private
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	@FindBy(xpath = "//*[@type='email']")
	@CacheLookup
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(id = "password")
	@CacheLookup
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	
	
	
	
	
	
	
	
	
	
}
