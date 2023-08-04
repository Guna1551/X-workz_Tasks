package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.BankRule;

public class CustomerBankRule implements BankRule{

	@Override
	public void loan() {
		System.out.println("Running loan in CustomerBankRule");
	}
	
}
