package com.neotech.review06;

public class USA {
	
	// access modifiers
	
	private String capitalCity = "WASHINGTON DC";
	protected String mainState = "NEW YORK";
	String normalState = "CALIFORNIA";
	public String bestSchool = "NEOTECH ACADEMY";
	
	private void selectPresident() {
		
		System.out.println("Selecting president only within USA");
		
	}
	
	public void speakEnglish() {
		
		
		System.out.println("English can be spoken everywhere");
	}
	
	public static void main(String[] args) {
		
		
		USA us = new USA();
	
		System.out.println("Accessing modifiers");
		System.out.println("private -- " + us.capitalCity);
		System.out.println("protected --" + us.mainState);
		System.out.println("default --- " + us.normalState);
		System.out.println("public -----" + us.bestSchool);
	}
	

}
