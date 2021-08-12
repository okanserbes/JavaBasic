package com.neotech.review04;

public class greetingclass {
	
	
		// Create a method sayGreetingWithNumber

		// that accepts the greeting and how many times it should be printed

		

		

		void sayGreetingWithNumber( String greeting2, int times) {		
			
			for(int i = 0; i<times; i++) {			
				System.out.println(greeting2 + " ");			
							
			}		
	}


		public static void main(String[] args) {
			
			greetingclass greet = new greetingclass();
			
			greet.sayGreetingWithNumber("Merhaba", 5);
			
		}
		
}
