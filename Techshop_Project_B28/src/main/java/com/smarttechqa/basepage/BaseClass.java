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
		
		
		driver.findElement(By.xpath("//a[@href='/login']")).click(); //This is going to the login page
		//driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
		//driver.findElement(By.id("email")).sendKeys("testuser@email.com");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testuser@email.com"); //Sending the email address
		//Thread.sleep(10000);
		Utilities.getHighLighter(driver.findElement(By.xpath("//*[@type='email']")));
		Utilities.takeScreenShot();
		
		driver.findElement(By.id("password")).sendKeys("123456");
		//driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//Thread.sleep(10000);
		System.out.println("The title of the application is : "+driver.getTitle()); //To verify if you logged in 
		
		Utilities.getExplicitWait(driver.findElement(By.xpath("//a[@href='/cart']")),5);
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
		//driver.findElement(By.linkText("Go Back")).click(); //this will take me back to the home page from the cart page
		driver.findElement(By.partialLinkText("Go")).click();
		
		
		Utilities.getExplicitWait(driver.findElement(By.name("q")), 10);
		driver.findElement(By.name("q")).sendKeys("iphone"); //Sends keys to the searchbox
		//driver.findElement(By.cssSelector(".p-2 btn btn-outline-success")).click();
		//driver.findElement(By.xpath("//*[text()='Search']")).click();
		driver.findElement(By.name("q")).submit();
		driver.navigate().back(); //This takes to the previous page.
		driver.navigate().refresh(); //This will click on the refresh button and refreshes the page. 
		//driver.navigate().to("https://www.smarttechqa.com/"); //This is the same as the get method
		//driver.quit();
		//added comment for git pull
		
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseClass.setUp();
		
	}
	

}
