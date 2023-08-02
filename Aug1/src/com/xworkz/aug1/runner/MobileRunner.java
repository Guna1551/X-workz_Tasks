package com.xworkz.aug1.runner;

import com.xworkz.aug1.abstractclass.MobileBudget;
import com.xworkz.aug1.implementation.Google;
import com.xworkz.aug1.implementation.Samsung;

public class MobileRunner {

	public static void main(String[] args) {
		
		MobileBudget samsung = new Samsung();
		samsung.displayType();
		samsung.type();
		samsung.price();
		
		MobileBudget google = new Google();
		google.displayType();
		google.price();
		google.type();

	}

}
