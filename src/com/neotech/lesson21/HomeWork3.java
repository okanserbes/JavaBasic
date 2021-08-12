package com.neotech.lesson21;

public class HomeWork3 {

	// Homework 3:
	// Write a Java program called Teacher. Identify features and behaviour of that
	// Class. Create 3 subclasses
	// MathTeacher, ChemistryTeacher and PianoTeacher that would have it their
	// own features and behaviour. Test all 4 classes.

	String name;
	String classes;

	public HomeWork3(String name, String classes) {

		this.name = name;
		this.classes = classes;

	}

	public void speakEnglish() {

		System.out.println(name + " speaks good English to be lecturer");
		System.out.println("He is giving these classes : " + classes);

	}

	public class MathTeacher extends HomeWork3 {
		
		String name;
		String classes;
		public MathTeacher(String name, String classes) {
			super(name, classes);

		}
	}

	public class PianoTeacher extends HomeWork3 {
		String name;
		String classes;
		public PianoTeacher(String name, String classes) {
			super(name, classes);

		}
	}

	public class ChemistryTeacher extends HomeWork3 {

		public ChemistryTeacher(String name, String classes) {
			super(name, classes);

		}
	}

	public static void main(String[] args) {
	
		HomeWork3 home = new HomeWork3 ("OKAN", "HISTORY");
		MathTeacher math2 = new MathTeacher ("ALI", "MATH");
		PianoTeacher pia = new PianoTeacher ("SABAH" , "CHEMISTRY");
		
		home.speakEnglish();
		math2.speakEnglish();
		pia.speakEnglish();
		
		
	}
}


