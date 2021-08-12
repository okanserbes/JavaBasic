package com.neotech.lesson20;

public class HomeWork2 {

	//Homework 2:
		// Write a program that will have 4 different access levels of constructors and
		// create 3 objects of this class: 1 -inside same class; 2 -from outside the
		// class; 3 -from different class inside different package and observe result.
	
	private void PRINT() {
	      System.out.println("Private access"); 
	   }
	public void getPrint() {
	      System.out.println("Public access"); 
	   }
	protected void getPrint2() {
	      System.out.println("Protected access"); 
	   }
	
	
	
	
	public static void main(String[] args) {
		
		
			   
			      HomeWork2 private1= new HomeWork2();
			      private1.PRINT();
			      private1.getPrint();
			      private1.getPrint2();
			      
			      
			      
	

}
}