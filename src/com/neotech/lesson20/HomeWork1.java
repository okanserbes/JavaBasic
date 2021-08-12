package com.neotech.lesson20;

public class HomeWork1 {

	// Homework 1:
	// Write program as a Student class that has instance variables name and
	// address. Create a constructor that will initialize those variables. Print
	// name & address of given student using displayInfo method.

//Homework 2:
	// Write a program that will have 4 different access levels of constructors and
	// create 3 objects of this class: 1 -inside same class; 2 -from outside the
	// class; 3 -from different class inside different package and observe result.

//Homework 3:
	// Write program that have static constructor and observe result.


	String stname, address;
	
	public HomeWork1(String studentname1, String address1) {
		
		stname= studentname1;
		address = address1;
		
		private void displayInfo(){
			
			System.out.println (stname + address);
			
			
			
		}
		
	}

		
public static void main(String[] args) {
		
		
		HomeWork1 s1 = new HomeWork1("ALI", "ORLANDO");
		HomeWork1 s2 = new HomeWork1("Mufasa", "NJ");
		HomeWork1 s3 = new HomeWork1("Murat", "NY");
		HomeWork1 s4 = new HomeWork1("Shodmon", "VEGAS");
		
		s1.displayInfo();
		s2.displayInfo();
		s3.displayInfo();
		s4.displayInfo();
	}







}



