package com.smarttechqa.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	//Static variable are outside of methods and inside the class
	public static WebDriver driver;
	public static Properties property;
	public static Logger logger;
		
	public BaseClass() {
		logger = Logger.getLogger("Automation Testing");
		PropertyConfigurator.configure("src/test/resources/Log4j.properties");		
	} 

	public static void initializeProperties()      {	
		
		try {
			property = new Properties();
			InputStream ip = new FileInputStream("src/test/resources/config.properties");
			property.load(ip);
		} catch (IOException error) {	
			error.printStackTrace();
			System.out.println("Can't find the file");		
		} catch (Exception error) {
			error.getMessage();
		} finally {
			System.out.println("This code will always run");
		}
	}
		
	public static void setUp(){
		if(property.getProperty("BrowserType").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		} else if (property.getProperty("BrowserType").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (property.getProperty("BrowserType").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
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
	
//	public static void main(String[] args) throws InterruptedException, IOException {
//		
//		BaseClass.setUp();
//		
//	}
	

}
