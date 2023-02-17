package com.smarttechqa.testng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	
	//How to find the second highest number from an array. How to find the second highest
	//salary from an array.
	
	public static void secondHighestSalary() {
		int [] salary = {5000, 6000, 4000, 4500};
		//first find the length of the array
		int size = salary.length;
		//then sort the array
		Arrays.sort(salary);
		//get the second from last index with -2
		// {4000, 4500, 5000, 6000}
		int secondHighest = salary[size-2];
		System.out.println("The second highest salary is : "+secondHighest);
		
	}
	
	public static void convertArrayToList() {
		int [] salary = {5000, 6000, 4000, 4500};
		List <int []> list = Arrays.asList(salary);
		System.out.println(list);
	}
	
	//How to find a duplicate value from an array?
	public static void findDuplicateNumber() {
		int [] duplicate = {6, 7, 7, 8, 8, 4, 2};
		//First remove the duplicate using Set, then use a loop to find the missing duplicate
		Set<Integer> unique = new HashSet<>();
		for (int i = 0; i < duplicate.length; i++) {
			//add a condition
			if (unique.add(duplicate[i]) == false) {
				System.out.println(duplicate[i]);
			}
		}		
	}
	
	
	//How to find a prime number?
	//Prime number is a number that is divisible by itself or by one
	// Example 5 is a prime because if you divide 5 by 5 you get one or if you divide
	// 5 by one then you get 5
	
	public static void isPrimeNumber() {
			    // Input number
			    int n = 9;

			    // Holds the count of values
			    int count = 0;

			    // There is no prime number less than 2.
			    if (n <= 1) {
			      System.out.println("The number is not prime");
			      return;
			    }

			    // Do a for loop
			    for (int i = 1; i <= n / 2; i++) {
			      if (n % i == 0) {
			        count++;
			      }
			    }

			    // If the number of factors is greater than 1,
			    // the number is not prime.
			    if (count > 1) {
			        System.out.println("The number is not prime");
			    }
			    else {
			      System.out.println("The number is prime");
			    }

	}
			

	public static void maxSubArray() {
        // -5, -4, -3, -2, -1, 0, 1, 2, 3.....
		
		int[] nums = {1, 2, -4, 1, 3, -2, 3, -1};
        int maxT = Integer.MIN_VALUE;
		 int sumT = 0;
		 for(int i = 0;i<nums.length;i++) {
			 sumT = sumT + nums[i];
			 if(maxT < sumT) {
				 maxT = sumT;
			 }
			 if(sumT < 0) {
				 sumT = 0;
			 }
		 }
       System.out.println(maxT);

   }
		
	
	
	
	
	public static void main(String[] args) {
		
		CollectionsPractice obj = new CollectionsPractice();
		//obj.listMaxNumber();
		//obj.arrayMaxNumber();
		//CollectionsPractice.secondHighestSalary();
		//CollectionsPractice.findDuplicateNumber();
		//CollectionsPractice.isPrimeNumber();
		CollectionsPractice.maxSubArray();
	}
	
	
	

}
