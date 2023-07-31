package com.xworkz.jul28.inheritance.hierarchical;

public class Bike extends Vehicle {
	
	String wheelType;
	double price;
	
	public Bike(String name, String engineName, double enginecc, String wheelType, double price) {
		super(name, engineName, enginecc);
		this.wheelType=wheelType;
		this.price=price;
	}
	
	void printInfo() {
		System.out.println("Brand Name : "+this.name);
		System.out.println("Engine Name : "+this.engineName);
		System.out.println("Engine CC "+this.enginecc);
		System.out.println("Wheel Type: "+this.wheelType);
		System.out.println("Price : "+this.price);
	}
}
