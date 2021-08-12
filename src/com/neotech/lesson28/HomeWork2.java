package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork2 {

	public static void main(String[] args) {
		
		
		//2- Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.

		
		ArrayList<Integer> integer = new ArrayList<>();
		
		for(int  i= 0 ; i < 50 ; i+=2) {
			
			integer.add(i);
			
		}
			System.out.println("even numbers from 1 to 50" + integer);
			
			Iterator<Integer> it = integer.iterator();
			
			while(it.hasNext()) {
				
				Integer number = it.next();
				
				if(number%5==0) {
					
					it.remove();
				}
				
			}
	
	System.out.println(integer);
	
	
	}

}
