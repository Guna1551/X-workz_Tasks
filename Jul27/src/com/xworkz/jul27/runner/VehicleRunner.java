package com.xworkz.jul27.runner;

import com.xworkz.jul27.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("TATA", "Car", 4, "Mysuru", 1000000);
		Vehicle vehicle2 = new Vehicle("TATA", "Car", 4, "Mysuru", 1000000);
		
		boolean ref = vehicle.equals(vehicle2);
		System.out.println("Both are same : "+ref);
	}

}
