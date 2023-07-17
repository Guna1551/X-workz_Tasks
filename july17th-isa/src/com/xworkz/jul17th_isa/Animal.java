package com.xworkz.jul17th_isa;

public class Animal {
	
	String name;
	int weight;
	int height;
	
	public Animal(String name, int weight, int height) {
		
		this.name=name;
		this.height=height;
		this.weight=weight;
		
	}
	
	void printInfo() {
		System.out.println("Name : "+this.name);
		System.out.println("Weight : "+this.weight);
		System.out.println("Height : "+this.height);
	}
}
