package com.xworkz.jul26th.runner;

import com.xworkz.jul26th.app.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		
		Grinder grinder = new Grinder();
		System.out.println(grinder);
		
		grinder.setCost(5000);
		grinder.setName("Prestige");
		grinder.setRpm(600);
		grinder.setType("Hand");
		grinder.setWeight(10);
		
		System.out.println(grinder);
		
		

	}

}
