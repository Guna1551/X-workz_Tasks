package com.xworkz.jul17th_isa;

public class Money extends Currency {
	
	public Money(String name, String type, int noOfDenominations) {
		super(name,type,noOfDenominations);
		this.name=name;
		this.type=type;
		this.noOfDenominations=noOfDenominations;
		
	}

}
