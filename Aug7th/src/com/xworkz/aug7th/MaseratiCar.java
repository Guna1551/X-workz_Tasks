package com.xworkz.aug7th;

public interface MaseratiCar extends Car{
	
	void racing();
	
	default void interior() {
		System.out.println("Interior");
	}

}
