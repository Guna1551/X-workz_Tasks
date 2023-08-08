package com.xworkz.aug7th;

public interface MercedesCar extends Car {
	
	void convertible();
	
	default void comfort() {
		System.out.println("Comfort");
	}

}
