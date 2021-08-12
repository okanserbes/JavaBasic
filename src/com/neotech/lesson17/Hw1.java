package com.neotech.lesson17;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {

		// Create a String and print it in reverse order (Sunday -> yadnuS).
		// Solve it using charAt(), toCharArray() and reverse() methods.

		// Note:
		// for charAt() and toCharArray() use String
		// for reverse you have to declare a StringBuffer object

		System.out.println("Enter string to reverse:");

		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("Reversed string is:");
		System.out.println(reverse);

		System.out.println("------------------------------------");
		System.out.println("with toCharArray");

		String word = "OKAN SERBES";

		char[] ch = word.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--)

		{

			System.out.print(ch[i]);
		}
		
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("---with reverse()---");
		
		
		 
		 String read1 = "IT IS GETTING HARDER";
		
		 
		 StringBuilder sb = new StringBuilder(read1);
		 
		 System.out.println("Reversed string is:");
		 System.out.println(sb.reverse().toString());
		 
	
	}

	}


