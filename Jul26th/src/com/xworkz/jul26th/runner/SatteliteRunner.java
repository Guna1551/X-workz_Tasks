package com.xworkz.jul26th.runner;

import com.xworkz.jul26th.app.Sattelite;

public class SatteliteRunner {

	public static void main(String[] args) {
		
		Sattelite sattelite = new Sattelite();
		System.out.println(sattelite);
		
		sattelite.setName("Chandrayan 3");
		sattelite.setWeight(500);
		sattelite.setMaterial("Gold");
		sattelite.setSpaceAgencyName("ISRO");
		sattelite.setCost(600);
		
		System.out.println(sattelite);

	}

}
