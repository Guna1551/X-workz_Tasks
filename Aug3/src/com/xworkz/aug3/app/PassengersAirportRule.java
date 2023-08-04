package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.AirportRules;

public class PassengersAirportRule implements AirportRules{
	
	@Override
	public void boarding() {
		
		System.out.println("Running boarding() in PassengersAirportRule");
		
	}

}
