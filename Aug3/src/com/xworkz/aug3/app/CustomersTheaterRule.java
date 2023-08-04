package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.TheaterRules;

public class CustomersTheaterRule implements TheaterRules{
	
	@Override
	public void seating() {
		System.out.println("Running seating CustomerTheaterRule");
	}

}
