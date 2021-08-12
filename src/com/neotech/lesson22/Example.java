package com.neotech.lesson22;

public class Example {

	
	class Walking {
		public void walk() {
		System.out.println("Man walking fastly");
		}
		}
		
	class Man extends Walking {
		
		public void walk() {
		System.out.println("Man walking slowly");
		}
		}
		
		
		public static void main(String[] args) {
			
				Example obj = new Example();
				obj.walk();
		}
}
