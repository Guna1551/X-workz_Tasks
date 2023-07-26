package com.xworkz.jul26th.runner;

import com.xworkz.jul26th.app.Headset;

public class HeadsetRunner {

	public static void main(String[] args) {
		
		Headset headset = new Headset();
		System.out.println(headset);
		
		headset.setBluetoothVersion(5.2);
		headset.setBrandName("Boat");
		headset.setCost(1500);
		headset.setDriverSize(40);
		headset.setType("Wireless");
		
		System.out.println(headset);

	}

}
