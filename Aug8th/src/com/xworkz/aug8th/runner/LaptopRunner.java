package com.xworkz.aug8th.runner;

import com.xworkz.aug8th.app.Guna;
import com.xworkz.aug8th.implementor.HPLaptop;
import com.xworkz.aug8th.rule.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Laptop laptop = new HPLaptop();
		
		Guna guna = new Guna();
		guna.setLaptop(laptop);
		guna.laptopDisplay();

	}

}
