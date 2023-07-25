package com.xworkz.jul17th_isa;

public class LivingThingRunner {

	public static void main(String[] args) {
		
		LivingThing plant1 = new Plant("Grass", "Green", "Herbs");
		plant1.printInfo();
		
		System.out.println();
		
		LivingThing plant2 = new Plant("Jasmine", "Green", "Climbers");
		plant2.printInfo();
		
	}

}
