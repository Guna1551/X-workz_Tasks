package com.xworkz.jul27.app;

public class DryFruit {
	
	private String name;
	private String color;
	private double weight ;
	private int cost;
	private String location;
	private int noOfPieces;
	
	public DryFruit(String name, String color, double weight, int cost, String location, int noOfPieces) {
		
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.cost = cost;
		this.location = location;
		this.noOfPieces = noOfPieces;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("Continue!!!");
			
			if(obj instanceof DryFruit) {
				System.out.println("Instance of Vehicle");
				
				DryFruit ref = (DryFruit)obj;
				if(this.cost == ref.cost && this.name == ref.name && this.color == ref.color && this.location == ref.location) {
					return true;
				}
			}else {
				System.err.println("Not an Instance of Dry Fruit");
			}
		}else {
			System.err.println("Passing Null");
		}
		
		return false;
	}

}
