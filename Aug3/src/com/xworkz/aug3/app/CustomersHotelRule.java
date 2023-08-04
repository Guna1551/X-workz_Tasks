package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.HotelRules;

public class CustomersHotelRule implements HotelRules{
	
	@Override
	public void entry() {
		
		System.out.println("Running entry in CustomerHotelRule"); 
		
}
}