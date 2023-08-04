package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.HomeRules;

public class PeopleHomeRule implements HomeRules{
	
	@Override
	public void cleaning() {
		
		System.out.println("Running cleaning in PeopleHomeRule");
		
	}

}
