package com.xworkz.aug7th;

public interface FiveStar extends Chocolate {
	
	void color();
	default void taste() {
		System.out.println("Invoking taste In Five Star");
	}

}
