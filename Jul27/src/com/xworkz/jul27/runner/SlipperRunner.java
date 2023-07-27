package com.xworkz.jul27.runner;

import com.xworkz.jul27.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		
		Slipper slipper = new Slipper("Puma", "India", "Male", "Sports", 10, 5000, "Synthetic");
		Slipper slipper2 = new Slipper("Puma", "India", "Male", "Sports", 10, 5000, "Synthetic");
		
		boolean ref = slipper.equals(slipper2);
		System.out.println("Both are same : "+ref);
	}

}
