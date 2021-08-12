package com.neotech.lesson16;

import java.util.Scanner;

public class NewHomeWork3 {

	public static void main(String args) {

		// Homework 3:
		// Write a program that reads two parent's first names and if they expecting boy
		// or girl?
		// Based on the input suggests a name for a baby:
		// If it is a boy get half from dad and half from mom.
		// If it is a girl get half from mom and half from dad.

		// Example Output:
		// Mom's first name? Mary
		// Dad's first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY
		// Example Output:
		// Mom's first name? Mary
		// Dad's first name? Daniel
		// Boy or Girl? girl
		// Suggested baby name: MAIEL

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mom's first name?");
		
		String mom = input.next();
		
		System.out.println("Dad's first name?");
		
		String dad = input.next();
		
		System.out.println("Boy or Girl??");
		
		String boyorgirl = input.next();
		
		if (boyorgirl == "boy") {
			
			System.out.println(dad.substring(0, dad.length() / 2) + mom.substring(mom.length() / 2, 0 ) );
			
			
		}
		
		else if ( boyorgirl == "girl") {
			
			System.out.println(mom.substring(0, mom.length() / 2) + dad.substring(dad.length() / 2, 0 ) );
			
			
			
		}
		
		else {
			
			System.out.println("You put wrong output");
		}
		
		
		
		
		
		
		
		
	}

}
