package com.xworkz.jul27.app;

public class Slipper {
	
	private String brandName;
	private String location;
	private String gender;
	private String type;
	private int size;
	private double cost;
	private String material;
	public Slipper(String brandName, String location, String gender, String type, int size, double cost,
			String material) {
		this.brandName = brandName;
		this.location = location;
		this.gender = gender;
		this.type = type;
		this.size = size;
		this.cost = cost;
		this.material = material;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("Continue!!!");
			
			if(obj instanceof Slipper) {
				System.out.println("Instance of Slipper");
				
				Slipper ref = (Slipper)obj;
				if(this.cost == ref.cost && this.location == ref.location && this.size == ref.size && this.material == ref.material) {
					return true;
				}
			}else {
				System.err.println("Not an Instance of Slipper");
			}
		}else {
			System.err.println("Passing Null");
		}
		
		return false;
	}
	
	
	

}
