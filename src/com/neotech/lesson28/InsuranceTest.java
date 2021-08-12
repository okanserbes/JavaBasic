package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		
		
		ArrayList<Insurance> insuranceList = new ArrayList<>();
		
		insuranceList.add(new CarInsurance("Progressive", "Highlander"));
		insuranceList.add(new PetInsurance("Geico", "Misa"));
		insuranceList.add(new HealthInsurance("DairyLand"));
		
		Iterator<Insurance> it = insuranceList.iterator();
		
		while(it.hasNext()) {
			
			Insurance ins = it.next();
			ins.cancelInsurance();;
			ins.getQuote();
		}
		
		
	}

}
