package com.xworkz.jul26th.runner;

import com.xworkz.jul26th.app.Mixture;

public class MixtureRunner {
	public static void main(String[] args) {
		
		Mixture mixture = new Mixture();
		System.out.println(mixture);
		
		mixture.setColor("Orange");
		mixture.setCost(500);
		mixture.setFlavour("Mint");
		mixture.setName("Aloo Bhujia");
		mixture.setWeight(100);
		
		System.out.println(mixture);
		
		
	}

}
