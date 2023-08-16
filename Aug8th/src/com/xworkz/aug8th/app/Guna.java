package com.xworkz.aug8th.app;

import com.xworkz.aug8th.rule.Laptop;

public class Guna {
	
	private Laptop laptop;
	
	public void laptopDisplay() {
		
		if (laptop != null) {
			System.out.println("Continue!!!");
			laptop.display();
		}
		else {
			System.out.println("It seems laptop is null!!!");
		}
		this.setLaptop(laptop);
		
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
