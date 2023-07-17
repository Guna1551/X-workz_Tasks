package com.xworkz.jul17th_isa;

public class CurrencyRunner {

	public static void main(String[] args) {
		Currency money1 = new Money("Thousand", "Rupee", 5);
		money1.printInfo();
		
		System.out.println();
		
		Money money2 = new Money("Five Hundred", "Rupee", 10);
		money2.printInfo();

	}

}
