package com.xworkz.aug8th.implementor;

import com.xworkz.aug8th.rule.WaterPurifier;

public class KentWaterPurifier implements WaterPurifier {

	@Override
	public boolean filter() {
		System.out.println("Running filter in Kent Water Purifier");
		return true;
	}

}
