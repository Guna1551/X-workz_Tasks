package com.xworkz.jul17th_isa;

public class BuildingRunner {

	public static void main(String[] args) {
		
		Building home1 = new Home("Samrudhi", 3, 2);
		home1.printInfo();
		
		System.out.println();
		
		Home home2 = new Home("Dhanya", 5, 3);
		home2.printInfo();

	}

}
