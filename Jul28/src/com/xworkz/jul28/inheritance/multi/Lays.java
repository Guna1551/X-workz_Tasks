package com.xworkz.jul28.inheritance.multi;

public class Lays extends PotatoChips {
	
	String flavour;

	public Lays(String name, double price, String type, String flavour) {
		super(name, price, type);
		this.flavour=flavour;
	}
	
	//Run Time Polymorphism 
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("Chips Type : "+this.type);
		System.out.println("Flavour : "+this.flavour);
	}

}
