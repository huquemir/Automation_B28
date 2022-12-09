package com.smarttechqa.excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	//Where do we get the data?
	//We need to create an excel file, put in our project and use use this path to locate datat
	//To create the data, you need to open the excel sheet. Microsoft excel, google docs, libre office, etc
	//Import the excel file to the project in a folder called Test Data
	//We have to use Java to import the data. We have to use FileInputStream to specify
	//the location of the excel 
	
	
	public static List<String> excelRead(int col) throws IOException {
	
		//Serilization. In the parameter, you have to mention where the file is located 
		FileInputStream read = new FileInputStream("./TestData/SearchTerms.xlsx");
		
		//After you import the file, you have to use apache poi to read that file		
		XSSFWorkbook workbook = new XSSFWorkbook(read);
		
		//Then you have to read the sheet name from excel
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//Then you have to use the Iterator interface. 
		Iterator<Row> iterator = sheet.iterator();
		iterator.next(); //This next method means that you have to skip the header 
		
		//Import the data from the Iterator superinterface into a List and create
		//an arraylist object
		
		List<String> list = new ArrayList<>();
		
		//We have to loop through the rows and columns. Here we have to use the while
		//We don't know the size of the excel
		while (iterator.hasNext()) {
			 list.add(iterator.next().getCell(col).getStringCellValue());
		}
		
		return list;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(ReadExcel.excelRead(0).get(0));
		System.out.println(ReadExcel.excelRead(0).get(1));
		System.out.println(ReadExcel.excelRead(0).get(2));		
		System.out.println(ReadExcel.excelRead(1).get(0));
			
	}
	
	

}
