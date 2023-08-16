package com.xworkz.aug8th.runner;

import com.xworkz.aug8th.app.Harsha;
import com.xworkz.aug8th.implementor.KentWaterPurifier;
import com.xworkz.aug8th.rule.WaterPurifier;

public class WaterPurifierRunner {

	public static void main(String[] args) {
		
		WaterPurifier purifier = new KentWaterPurifier();
		Harsha harsha = new Harsha();
		harsha.purify(purifier);

	}

}
