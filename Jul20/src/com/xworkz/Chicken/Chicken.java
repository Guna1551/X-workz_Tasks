package com.xworkz.Chicken;

public class Chicken {
	
	int price;
	String location;
	
	public Chicken(int price, String location) {
		this.price=price;
		this.location=location;
		
	}
	
	void printInfo() {
		System.out.println("Price : "+this.price);
		System.out.println("Location : "+this.location);
	}

}
