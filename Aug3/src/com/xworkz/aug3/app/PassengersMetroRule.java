package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.MetroRules;

public class PassengersMetroRule implements MetroRules{
	
	@Override
	public void entry() {
		
		System.out.println("Running entry in PassengersMetroRule");
		
	}

}
