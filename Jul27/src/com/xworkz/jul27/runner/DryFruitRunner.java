package com.xworkz.jul27.runner;

import com.xworkz.jul27.app.DryFruit;

public class DryFruitRunner {

	public static void main(String[] args) {
		
		DryFruit dryFruit = new DryFruit("Dates", "Brown", 100, 250, "Rajasthan", 10);
		DryFruit dryFruit2 = new DryFruit("Dates", "Brown", 100, 250, "Rajasthan", 10);
		
		boolean ref = dryFruit.equals(dryFruit2);
		System.out.println("Both are same : "+ref);

	}

}
