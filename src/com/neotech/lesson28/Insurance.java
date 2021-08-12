package com.neotech.lesson28;

public abstract class Insurance {
	
	
	//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviouras getQuote and cancelInsurance. 
	//Create 3 subclasses Car, Pet, Health. Car class has it’sown attribute as carModel and Class Pet has petType attribute. 
	//Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.

	String insuranceName;
	
	 public Insurance(String insuranceName) {
		super();
		this.insuranceName = insuranceName;
	}

	abstract void getQuote() {}
	
	abstract void cancelInsurance() {}
	
	
}

class CarInsurance extends Insurance {

	String carModel;
	
	
	
	
	public CarInsurance(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	void getQuote() {
		System.out.println("The insurance price for" + carModel + "is $500");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("We are gonna cancel insurance for" + carModel);
		
	}
	
	class PetInsurance extends Insurance {

		String petType;
		
		
		public PetInsurance(String insuranceName, String petType) {
			super(insuranceName);
			this.petType = petType;
		}

		@Override
		void getQuote() {
			System.out.println("The insurance price for" + petType + "$300");
			
		}

		@Override
		void cancelInsurance() {
			System.out.println("We are gonna cancel insurance for" + carModel);
			
		}	
		
		
	}
	
	class HealthInsurance extends Insurance {



		public HealthInsurance(String insuranceName) {
			super(insuranceName);
			
		}

		@Override
		void getQuote() {
			System.out.println("The insurance price for $1600");
			
		}

		@Override
		void cancelInsurance() {
			System.out.println("We are gonna cancel insurance ");
			
		}	
		
		
	}
	
}