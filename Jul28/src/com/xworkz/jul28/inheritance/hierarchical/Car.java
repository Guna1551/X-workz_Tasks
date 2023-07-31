package com.xworkz.jul28.inheritance.hierarchical;

public class Car extends Vehicle {
	
	int noOfWheels;
	double price;

	public Car(String name, String engineName, double enginecc, int noOfWheels, double price) {
		super(name, engineName, enginecc);
		this.noOfWheels=noOfWheels;
		this.price=price;
	}
	
	void printInfo() {
		System.out.println("Brand Name : "+this.name);
		System.out.println("Engine Name : "+this.engineName);
		System.out.println("Engine CC "+this.enginecc);
		System.out.println("No of Wheels : "+this.noOfWheels);
		System.out.println("Price : "+this.price);
	}
}
