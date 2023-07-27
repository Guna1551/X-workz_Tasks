package com.xworkz.jul27.runner;

import com.xworkz.jul27.app.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		
		Gold gold = new Gold("Kalyan", 50, 500000, 24);
		Gold gold2 = new Gold("Kalyan", 50, 500000, 24);
		
		boolean ref = gold.equals(gold2);
		System.out.println("Both are same : "+ref);
		
	}

}
