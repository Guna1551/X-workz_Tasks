package com.xworkz.aug1.runner;

import com.xworkz.aug1.abstractclass.FashionPrice;
import com.xworkz.aug1.implementation.*;

public class FashionRunner {

	public static void main(String[] args) {
		
		FashionPrice allenSolly = new AllenSolly();
		allenSolly.type();
		allenSolly.fashionPrice();
		allenSolly.material();
		
		FashionPrice puma = new Puma();
		puma.fashionPrice();
		puma.type();
		puma.material();

	}

}
