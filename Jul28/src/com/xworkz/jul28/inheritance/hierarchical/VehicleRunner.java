package com.xworkz.jul28.inheritance.hierarchical;

public class VehicleRunner {

	public static void main(String[] args) {
		
		Vehicle car = new Car("Mahindra", "m Hawk", 1750, 4, 2500000);
		
		//Casting 
		Car car1 = (Car)car;
		car1.printInfo();
		
		System.out.println();
		
		Vehicle bike = new Bike("Kawasaki", "Ninja 300", 297, "Diamond Cut Alloys", 700000);
		
		//Casting 
		Bike bike1 = (Bike)bike;
		bike1.printInfo();
		
		System.out.println();
		
		Tata tata = new Tata("Tata", "Revetron", 1500, 4, 1500000);
		tata.features("Harman Kardon", true);
		tata.printInfo();
	}

}
