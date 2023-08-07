package com.xworkz.diammond.interfaces;

public class BTMCoolDrink implements CokeCoolDrink, PepsiCoolDrink {
	
	@Override
	public void cool() {
		
		System.out.println("Cool");
		
	}
	
	@Override
	public void energy() {
		System.out.println("Energy");
	}
	
	@Override
	public void stamina() {
		System.out.println("Stamina");
	}
	

}
