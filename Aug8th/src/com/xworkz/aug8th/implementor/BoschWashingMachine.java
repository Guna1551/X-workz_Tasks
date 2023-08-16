package com.xworkz.aug8th.implementor;

import com.xworkz.aug8th.rule.WashingMachine;

public class BoschWashingMachine implements WashingMachine {

	@Override
	public boolean wash() {
			System.out.println("Running wash in Bosch Washing Machine");
			return true;
	}

	@Override
	public boolean dry() {
		System.out.println("Running dry in Bosch Washing Machine");
		return true;
	}

}
