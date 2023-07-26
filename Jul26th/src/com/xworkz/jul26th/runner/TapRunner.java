package com.xworkz.jul26th.runner;

import com.xworkz.jul26th.app.Tap;

public class TapRunner {
	
	public static void main(String[] args) {
		Tap tap = new Tap();
		System.out.println(tap);
		
		tap.setBrandName("Jaguar");
		tap.setColor("Silver");
		tap.setMaterial("Steel");
		tap.setNoOfTaps(5);
		tap.setCost(500);
		
		System.out.println(tap);
	}

}
