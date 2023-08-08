package com.xworkz.aug7th;

public class CarRunner {

	public static void main(String[] args) {
		
		SpecialCar car = new SpecialCar();
		car.comfort();
		car.convertible();
		car.racing();
		car.speed();
		
		MercedesCar car2 = new SpecialCar();
		car2.comfort();
		car2.convertible();
		car2.speed();
		
		MaseratiCar car3 = new SpecialCar();
		car3.interior();
		car3.racing();
	}

}
