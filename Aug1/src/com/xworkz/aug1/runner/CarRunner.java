package com.xworkz.aug1.runner;

import com.xworkz.aug1.abstractclass.CarBudget;
import com.xworkz.aug1.abstractclass.CarPlan;
import com.xworkz.aug1.implementation.BMW;
import com.xworkz.aug1.implementation.Tata;

public class CarRunner {

	public static void main(String[] args) {
		
		CarBudget car1 = new BMW();
		car1.price();
		car1.engine();
		car1.type();
		
		System.out.println();
		
		CarBudget car2 = new Tata();
		car2.engine();
		car2.price();
		car2.type();

	}

}
