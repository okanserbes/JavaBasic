package com.neotech.lesson21;

public class HomeWork2 {

	// Homework 2:
	// Write program to inherit class A that has method printF
	// which is static and call or reuse that method into class B
	
	String employee;
	int id;
	
	public HomeWork2(String employee, int id) {
		
		this.employee = employee;
		this.id = id;
		
		}
	
	public void printF() {
		
		System.out.println(employee + id);
		
	}
	
	public class B extends HomeWork2 {

		public B(String employee, int id) {
			super(employee, id);
			
		
		
		
	}

	
	

}


	
public static void main(String[] args) {
	
	
	HomeWork2 hw = new HomeWork2("OKAN", 1178);
	
	hw.printF();
	
	
	
}




}
