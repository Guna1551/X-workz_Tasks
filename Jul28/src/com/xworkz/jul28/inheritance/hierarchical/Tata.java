package com.xworkz.jul28.inheritance.hierarchical;

// Hybrid Inheritance using Interfaces

public class Tata extends Car implements CarFeatures {
	
	String musicSystem;
	boolean adas;

	public Tata(String name, String engineName, double enginecc, int noOfWheels, double price) {
		super(name, engineName, enginecc, noOfWheels, price);
		
	}
	
	@Override
	public void features(String musicSystem, boolean adas) {
		
		this.musicSystem=musicSystem;
		this.adas=adas;
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("Music System : "+this.musicSystem);
		System.out.println("ADAS available : "+this.adas);
		
	}
	
	

}
