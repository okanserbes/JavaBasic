package com.neotech.lesson26;
import java.util.ArrayList;

public class HomeWork1 {
	
	//Create an arraylist of cars and retrieve all the values using 2 different (for and enhanced for) ways.
	
	public static void main(String[] args) {
		

	ArrayList<String> cars = new ArrayList<String>();
	
	cars.add("Nissan");
	cars.add("TOYOTA");
	cars.add("Hyundai");
	cars.add("Fiat");
	
	for(int i=0 ; i < cars.size() ; i++) {
		
		System.out.println(cars.get(i));
		
	}
	
	
	System.out.println("---------Advanced For Loop----------");
	for (String i: cars) {
		
		System.out.println(i);
	}
	
	
	
	
	
	
	
	}
}
