package com.xworkz.aug1.runner;

import com.xworkz.aug1.abstractclass.RocketPrice;
import com.xworkz.aug1.implementation.GSLV;
import com.xworkz.aug1.implementation.PSLV;

public class RocketRunner {

	public static void main(String[] args) {
		
		RocketPrice pslv = new PSLV();
		pslv.price();
		pslv.type();
		pslv.weight();
		
		System.out.println();
		
		RocketPrice gslv = new GSLV();
		gslv.price();
		gslv.type();
		gslv.weight();

	}

}
