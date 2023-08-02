package com.xworkz.aug1.abstractclass;

public abstract class RocketPrice extends Rocket {

	@Override
	public void price() {
		
		System.out.println("Price : 100 CR");

	}
	
	public abstract void weight();
	
}
