package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.PubRules;

public class CustomersPubRule implements PubRules{
	
	@Override
	public void age() {
		System.out.println("Running age in CustomersPubRule");
	}
}
