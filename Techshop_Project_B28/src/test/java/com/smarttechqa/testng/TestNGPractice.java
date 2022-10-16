package com.smarttechqa.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPractice {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	}
	
	
	@Test(priority = 1)
	public void googleSearch(){
		driver.findElement(By.name("q")).sendKeys("helloworld");
		
		
	}
	
	@Test(priority = 2)
	public void clickImageButton() {	
		driver.findElement(By.linkText("Images")).click();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
