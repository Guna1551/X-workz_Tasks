package com.xworkz.jul28.chocolate;

final class Chocolate {
	
	//final variables
	
	final String name;
	final String flavour;
	public Chocolate(String name, String flavour) {
		this.name = name;
		this.flavour = flavour;
	}
	
	final void displayInfo() {
		System.out.println("Name : "+this.name);
		System.out.println("Flavour : "+this.flavour);
	}
}
