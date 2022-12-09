package com.smarttechqa.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.smarttechqa.basepage.BaseClass;
import com.smarttechqa.excelutility.ReadExcel;

public class DataFromExcel extends BaseClass {
	
	@Test(dataProvider = "Search")
	public static void openBrowser(String col1, String col2) throws IOException {
		BaseClass.initializeProperties();
		BaseClass.setUp();
		//driver.findElement(By.xpath("//input[@class='mr-sm-2 ml-sm-5 form-control']")).sendKeys(ReadExcel.excelRead(0).get(0));
		driver.findElement(By.xpath("//input[@class='mr-sm-2 ml-sm-5 form-control']")).sendKeys(col2);
		
	}
	
	@DataProvider(name = "Search")
	public static String[][] searchTerms() {
		String [] [] obj = {{"amazon", "echo"}};
		return obj;
	}

}
