package com.xworkz.jul27.app;

public class Grocery {
	
	private String location;
	private double cost;
	
	public Grocery(String location, double cost) {
		this.location = location;
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if( obj != null) {
			System.out.println("Continue!!!");
			
			if (obj instanceof Grocery) {
				System.out.println("It is instance of Grocery!!!");
				
				Grocery ref = (Grocery)obj;
				
				if(this.cost == ref.cost && this.location == ref.location) {
					return true;
				}
				
			}
			else {
				System.err.println("It is not an instance of Grocery");
			}
		}
		else {
			System.err.println("It is having null !!!");
		}
		
		return false;
	}
}
