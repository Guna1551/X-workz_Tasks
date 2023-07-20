package com.xworkz.Chicken;

public class ChickenRunner {

	public static void main(String[] args) {
		
		Chicken chicken = new Chicken(450, "India");
		chicken.printInfo();
		
		System.out.println();
		
		FarmChicken farmChicken = new FarmChicken(250, "India", 5, "Raju");
		farmChicken.printInfo();
		
		System.out.println();
		
		BroilerChicken broilerChicken = new BroilerChicken(750, "India", true, 2);
		broilerChicken.printInfo();

	}

}
