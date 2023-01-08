package com.smarttechqa.testng;

public class StringPractice {
	
	
	public static void main(String[] args) {
		//What is the difference between equal equal and equals method?
		
		String s1 = "Name";
		String s2 = "Name";
		
		//System.out.println(s1 == s2);
		
		//If there are two equal signs == it is a comparison operator
		//The result of comparison operator are boolean. True or False
		
		//Classname obj = new Classname();
		String obj = new String("Name");
		String obj1 = new String("Name");
		
		//This is false 
		//System.out.println(obj == obj1);
		
		//To compare objects, instead of the comparison operator == we 
		//have to use the equals method
		
		//This is true
		System.out.println(obj.equals(obj1));
		
		//Some other methods and properties of String class. You can
		//print the length
		
		System.out.println(s2.length());
		System.out.println(s2.concat(" Employee"));
		
		
		//What is a string buffer?
		//It is another Class like String but has different methods like
		//reverse
		
		StringBuffer rev = new StringBuffer("Name");
		System.out.println(rev.reverse());
		
		//What is the difference between string buffer and string builder?
		//String buffer is synchronized. String builder is non-synchronized
		//String buffer is thread-safe. String builder is not thread safe.
		
		StringBuilder rev1 = new StringBuilder("Name");
		//System.out.println(rev1.reverse());
		System.out.println(rev1.charAt(1));
		
		System.out.println(rev1.append(" Department"));
		
		//String Buffer and String Builder are both mutable 
		//vs String Class is immutable.
		
			
		String country = new String("united states of america");
		String rev2 = new StringBuffer(country).reverse().toString();
		System.out.println(rev2);
		
		
		//How to split a word
		
		String obj2 = new String("United States of America");		
		for (String obj3 : obj2.split(" ")) {
						System.out.println(obj3);
				}
		
		String obj4 = new String("United-States-of-America");
		for (String obj5 : obj4.split("-")) {
			System.out.println(obj5);
		}
		
		String obj6 = new String("United,States,of,America");
		for (String obj7 : obj6.split(",")) {
			System.out.println(obj7);
		}
		
		//Sub strings 
		
		String sub = new String("States");
		System.out.println(sub.substring(1, 5));
		
		
		
		
		
	}
	
	
	
	

}
