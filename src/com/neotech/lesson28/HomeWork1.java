package com.neotech.lesson28;

import java.util.ArrayList;

public class HomeWork1 {

	public static void main(String[] args) {
	
		//1 - Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
		//2- Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.
		//3 - Create a class Insurance that will have an attribute as insuranceNameand unimplemented behaviouras getQuoteand cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’sown attribute as carModeland Class Pet has petTypeattribute. 
		//Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
		
		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("COKE");
		drinks.add("FANTA");
		drinks.add("RED BULL");
		drinks.add("SANGRIA");
		
		System.out.println("The initial values in ArrayList are : ");
		System.out.println(drinks);
		System.out.println("-----");
		for (String drk : drinks) {
			
			if(drk.contains("A") || drk.contains("E")) {
				
				drk = "water";
			}
			
			System.out.println(drk + " - ");

		}
		

	}

}
