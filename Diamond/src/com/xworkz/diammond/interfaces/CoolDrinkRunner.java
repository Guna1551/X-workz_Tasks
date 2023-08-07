package com.xworkz.diammond.interfaces;

public class CoolDrinkRunner {

	public static void main(String[] args) {

		BTMCoolDrink btmCoolDrink = new BTMCoolDrink();
		btmCoolDrink.cool();
		btmCoolDrink.energy();
		btmCoolDrink.stamina();
		
		System.out.println("*********************************");
		
		CokeCoolDrink ccd = new BTMCoolDrink();
		ccd.cool();
		ccd.stamina();
		
		System.out.println("*********************************");
		
		PepsiCoolDrink pcd = new BTMCoolDrink();
		pcd.cool();
		pcd.energy();
		

	}

}
