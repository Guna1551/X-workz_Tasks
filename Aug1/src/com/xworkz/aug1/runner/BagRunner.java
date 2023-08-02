package com.xworkz.aug1.runner;

import com.xworkz.aug1.abstractclass.BagPrice;
import com.xworkz.aug1.implementation.Adidas;
import com.xworkz.aug1.implementation.Gucci;

public class BagRunner {

	public static void main(String[] args) {
		
		BagPrice gucci = new Gucci();
		gucci.bagPrice();
		gucci.bagType();
		gucci.material();
		
		System.out.println();
		
		BagPrice adidas = new Adidas();
		adidas.bagPrice();
		adidas.bagType();
		adidas.material();
	}

}
