package com.xworkz.jul28.inheritance.hierarchical;

public class Vehicle {
	
	String name;
	String engineName;
	double enginecc;
	
	//Constructor Overloading
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, String engineName, double enginecc) {
		
		this.name = name;
		this.engineName = engineName;
		this.enginecc = enginecc;
	}
}
