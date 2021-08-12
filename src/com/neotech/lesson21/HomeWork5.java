package com.neotech.lesson21;

public class HomeWork5 {
	// Homework 5:
	// Write program: userClass that has a constructor that
	// initializes instance variable name and mobile number.
	// Create a subclass userInfo that will have user address
	// variable and it also being initialized through constructor
	// call. Print users name, mobile number and address in
	// userDetails method. Test your code.
	
	
	String name;
	int number;
	
	public HomeWork5(String name , int i) {
		
		this.name=name;
		this.number=i;
		
		
		}
	
	public void print() {
		
		System.out.println(name + number);
		
	}
	
	public class userInfo extends HomeWork5{

		String address;
		public userInfo(String name, int number) {
			super(name, number);
			this.address = "MATH";
			
			
		}
		
		
		
	}

	
	public static void main(String[] args) {
		
		userInfo user = new userInfo("ALI", 1134);
	
		user.print();
		
		
		
	}
}
