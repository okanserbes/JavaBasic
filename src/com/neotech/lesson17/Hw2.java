package com.neotech.lesson17;

public class Hw2 {

	public static void main(String[] args) {
		//     Write a program to print out the following conversion:
	    //		Today is Tuesday and we have a Java Class!!!  to 
	    // 		yadoT si yadseuT dna ew evah a avaJ !!!ssalC
		
		
		String word = "Today is Tuesday and we have a Java Class!!!";
		System.out.println(word);
		char[] array = word.toCharArray();
		String reverse = "";
		
		for (int i = word.length() -1 ; i>=0 ; i--) {
			
			reverse = reverse + array[i];
		}
		
System.out.println(reverse);
	}

}
