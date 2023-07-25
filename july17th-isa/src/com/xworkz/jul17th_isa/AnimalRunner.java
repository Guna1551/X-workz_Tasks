package com.xworkz.jul17th_isa;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal monkey1 = new Monkey("Monkey1", 20, 3);
		monkey1.printInfo();
		
		System.out.println();
		
		Monkey monkey2 = new Monkey("Monkey2", 15, 2);
		monkey2.printInfo();
		
	}

}
