package com.xworkz.shoe;

public class Nike extends Shoe {
	
	String ceo;
	String brandAmbassador;
	
	public Nike(String ceo, String brandAmbassador, double price, ShoeColor color, ShoeSize size) {
		super(price,color,size);
		this.ceo=ceo;
		this.brandAmbassador=brandAmbassador;
		
	}
	
	void printInfo() {
		System.out.println("CEO of Nike : "+this.ceo);
		System.out.println("Brand Ambasador : "+this.brandAmbassador);
		System.out.println("Price : "+this.price);
		System.out.println("Color : "+this.color);
		System.out.println("Size : "+this.size);
	}

}
