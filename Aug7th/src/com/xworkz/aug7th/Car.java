package com.xworkz.aug7th;

public interface Car {
	
	void speed();
	
	default void sunRoof() {
		System.out.println("Sun Roof");
	}

}
