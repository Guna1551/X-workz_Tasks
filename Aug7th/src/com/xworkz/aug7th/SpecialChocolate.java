package com.xworkz.aug7th;

public class SpecialChocolate implements FiveStar, Nestle {

	@Override
	public void flavour() {
		
		System.out.println("Invoking flavour in Special Cocolate");

	}

	@Override
	public void tasty() {
		System.out.println("Invoking tasty in Special Cocolate");
		
	}

	@Override
	public void color() {
		System.out.println("Invoking color in Special Cocolate");
	}

}
