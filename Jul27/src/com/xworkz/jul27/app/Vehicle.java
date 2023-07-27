package com.xworkz.jul27.app;

public class Vehicle {
	
	private String brandName;
	private String type;
	private int wheels;
	private String location;
	private double cost;
	
	public Vehicle(String brandName, String type, int wheels, String location, double cost) {
		super();
		this.brandName = brandName;
		this.type = type;
		this.wheels = wheels;
		this.location = location;
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("Continue!!!");
			
			if(obj instanceof Vehicle) {
				System.out.println("Instance of Vehicle");
				
				Vehicle ref = (Vehicle)obj;
				if(this.cost == ref.cost && this.brandName == ref.brandName && this.type == ref.type && this.location == ref.location) {
					return true;
				}
			}else {
				System.err.println("Not an instance of Vehicle");
			}
		}else {
			System.err.println("Passing Null");
		}
		
		return false;
	}
}
