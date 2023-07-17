package com.xworkz.jul17th_isa;

public class Currency {
	
	String name;
	String type;
	int noOfDenominations;
	
	public Currency(String name, String type, int noOfDenominations) {
		
		this.name=name;
		this.type=type;
		this.noOfDenominations=noOfDenominations;
	
	}
	
	void printInfo() {
		System.out.println("Name : "+this.name);
		System.out.println("Type : "+this.type);
		System.out.println("No Of Denomination : "+this.noOfDenominations);
	}

}
