package com.xworkz.Chicken;

public class BroilerChicken extends Chicken {
	
	boolean alive;
	double weight;
	public BroilerChicken(int price, String location, boolean alive, double weight) {
		super(price,location);
		this.alive = alive;
		this.weight = weight;
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("ALive : "+this.alive);
		System.out.println("Weight : "+this.weight+"Kg");
	}
}
