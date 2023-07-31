package com.xworkz.jul28.inheritance.single;

public class Sweet {
	
	String name;
	String origin;
	double price;
	public Sweet(String name, String origin, double price) {
		
		this.name = name;
		this.origin = origin;
		this.price = price;
	}
	
	void printInfo() {
		
		System.out.println("Name : "+this.name);
		System.out.println("Origin : "+this.origin);
		System.out.println("Price : "+this.price);
		
	}
}
