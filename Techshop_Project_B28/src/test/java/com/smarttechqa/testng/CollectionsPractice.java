package com.smarttechqa.testng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsPractice {
	
	//How to get the maximum values from an array?
		
	public void arrayMaxNumber() {
	
		int [] arr = {10, 20, 30, 40, 35, 25};
		    
        // Initialize maximum element
        int max = arr[0];
         
        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i];
                System.out.println(max); 
	}
	
	public void listMaxNumber() {
		
		List<Integer> number = new ArrayList<>
		(Arrays.asList(10,20,30,40,35,25));
		
		/*
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(35);
		number.add(25);
		*/
	
		//To get the maximum value in list, we can use the Collections class
		
		System.out.println(Collections.max(number));
		
		//To get the minium value from a list:
		System.out.println(Collections.min(number));
		
	}
	
	public static void main(String[] args) {
		
		CollectionsPractice obj = new CollectionsPractice();
		//obj.listMaxNumber();
		obj.arrayMaxNumber();
		
	}
	
	
	

}
