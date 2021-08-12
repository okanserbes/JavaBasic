package com.neotech.lesson22;

public class HomeWork1 {

	//Homework 1:
    //Create 1 class with 3 overloaded static methods. Then call each overloaded methods with specific arguments and observe the results.
	
	
	static void sumNumbers(int a, int b) {
		
		System.out.println(a + b);
		
		}
	
	static void sumNumbers(int a, int b, int c) {
		
		System.out.println(a+b+c);
		
	}
	
	
	static void sumNumbers(int z, double x, double d) {
		
		System.out.println(z+x+d);
		
	}
	
	
	public static void main(String[] args) {
		
		
		HomeWork1.sumNumbers(5, 4);
		HomeWork1.sumNumbers(2,1,3);
		HomeWork1.sumNumbers(5, 2.4,5);
	}

}