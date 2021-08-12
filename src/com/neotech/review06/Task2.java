package com.neotech.review06;

public class Task2 {

	
	// Create constractor 3 parameters. (name, int age,weight) Create person with all three.
	
	
	public String name;
	public int weight;
	public int age;
	
	public Task2(String personName, int personAge, int personWeight ) {
		
		name=personName;
		age= personAge;
		weight = personWeight;
		
	}
	
	public void displayInfo() {
		
		
		System.out.println("Name is " + name + " Age is " + age + " Weight is " + weight);
	}
	
	
	
	
}
