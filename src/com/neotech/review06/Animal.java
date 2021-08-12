package com.neotech.review06;

public class Animal {
	String name;
	int legs;
	
	public void displayInfo() {
		
		System.out.println(name + " has " + legs + "legs");
	}
	
	public void sleep() {
		
		System.out.println("ALL ANIMALS SLEEP");
	}
	
	
	
}


class Wolf extends Animal {
	
	
	
	
}

class Fox extends Animal {
	
	String furColor;
	
	public void displayInfo() {
		
		System.out.println("It has " + furColor + "fur color");
	}
	
	
	
}

class Bear extends Animal {
	
	public void roar() {
		
		System.out.println("Bear  can roar ");
		
	}
	
	
}