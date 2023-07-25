package com.xworkz.jul17th_isa;

public class InstituteRunner {

	public static void main(String[] args) {
		Institute xworkz1 = new Xworkz("X-workz", "BTM", 100);
		xworkz1.printInfo();
		
		System.out.println();
		
		Xworkz xworkz2 = new Xworkz("X-workz", "Rajajinagar", 250);
		xworkz2.printInfo();

	}

}
