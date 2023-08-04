package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.ArmyRule;

public class IndianArmyRule implements ArmyRule{
	
	@Override
	public void firing() {
		
		System.out.println("Running Firing in IndianArmyRule");
	}

}
