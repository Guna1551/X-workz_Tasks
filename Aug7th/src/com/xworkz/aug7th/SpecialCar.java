package com.xworkz.aug7th;

public class SpecialCar implements MaseratiCar, MercedesCar {

	@Override
	public void speed() {
		
		System.out.println("Running Speed in Special Car");

	}
	
	@Override
	public void convertible() {
		
		System.out.println("Running Convertible in Special Car");
		
	}
	
	@Override
	public void racing() {
		
		System.out.println("Running Racing in Special Car");
		
	}

}
