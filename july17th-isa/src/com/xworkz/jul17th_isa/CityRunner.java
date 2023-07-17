package com.xworkz.jul17th_isa;

public class CityRunner {

	public static void main(String[] args) {
		City bengaluru1 = new Bengaluru("Bengaluru North", "Karnataka", "India");
		bengaluru1.printInfo();
		
		System.out.println();
		
		Bengaluru bengaluru2 = new Bengaluru("Bengaluru South", "Karnataka", "India");
		bengaluru2.printInfo();

	}

}

