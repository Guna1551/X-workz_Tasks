package com.xworkz.jul27.app;

public class Gold {
	
	private String shopName;
	private int weight;
	private double price;
	private int karat;
	
	public Gold(String shopName, int weight, double price, int karat) {
		super();
		this.shopName = shopName;
		this.weight = weight;
		this.price = price;
		this.karat = karat;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("Continue!!!");
			
			if(obj instanceof Gold) {
				System.out.println("Instance of Gold");
				
				Gold ref = (Gold)obj;
				if(this.price == ref.price && this.shopName == ref.shopName && this.weight == ref.weight && this.karat == ref.karat) {
					return true;
				}
			}else {
				System.err.println("Not an instance of Gold");
			}
		}else {
			System.err.println("Passing Null");
		}
		
		return false;
	}
	
	

}
