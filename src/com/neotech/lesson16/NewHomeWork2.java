package com.neotech.lesson16;

public class NewHomeWork2 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String. (alpha characters means letters)
		
		
		String random = "ALI 1234 #$% okan";
		String alphanums =  random.replaceAll(  "[0-9 #$%]" , "");
		
		System.out.println(alphanums);
		
		System.out.println(alphanums.length() + " alpha characters are there in the String");
		
 		
		
		
	}

}
