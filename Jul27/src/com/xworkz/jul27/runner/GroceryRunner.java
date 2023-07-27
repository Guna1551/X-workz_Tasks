package com.xworkz.jul27.runner;

import com.xworkz.jul27.app.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
		
		Grocery grocery = new Grocery("Mysuru", 500);
		Grocery grocery2 = new Grocery("Bengaluru", 250);
		
		boolean ref=grocery.equals(grocery2);
		System.out.println("Both are same : "+ref);

	}
}
