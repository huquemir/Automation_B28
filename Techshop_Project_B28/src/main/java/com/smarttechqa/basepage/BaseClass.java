package com.smarttechqa.basepage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.smarttechqa.utils.Utilities;

public class BaseClass {

	//Static variable are outside of methods and inside the class
	public static WebDriver driver;
	
	public static void setUp() throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	//This will delete user session information	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.smarttechqa.com/"); //This goes the to URL of the application
		
		
		
		
		
	

		
		

		
	/*	
		
		//driver.findElement(By.linkText("Go Back")).click(); //this will take me back to the home page from the cart page
		driver.findElement(By.partialLinkText("Go")).click();
		
		
		

		driver.navigate().back(); //This takes to the previous page.
		driver.navigate().refresh(); //This will click on the refresh button and refreshes the page. 
		//driver.navigate().to("https://www.smarttechqa.com/"); //This is the same as the get method
		//driver.quit();
		//added comment for git pull
		*/
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseClass.setUp();
		
	}
	

}
