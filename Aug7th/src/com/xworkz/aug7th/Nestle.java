package com.xworkz.aug7th;

public interface Nestle extends Chocolate {
	
	void tasty();
	default void crunchy() {
		System.out.println("Invoking crunchy in Nestle");
	}

}
