package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.SaloonRules;

public class CustomerSaloonRule implements SaloonRules{
	
	@Override
	public void hairCut() {
		System.out.println("Running harcut in CustomersSaloonRule");
	}
}
