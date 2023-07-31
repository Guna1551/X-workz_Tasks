package com.xworkz.jul28.inheritance.multi;

public class Chips {
	
	String name;
	double price;
	public Chips(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
	void printInfo() {
		System.out.println("Name : "+this.name);
		System.out.println("Price : "+this.price);
	}
	
	

}
