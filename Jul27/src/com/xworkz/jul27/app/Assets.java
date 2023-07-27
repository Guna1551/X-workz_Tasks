package com.xworkz.jul27.app;

public class Assets {
	
	private String ownerName;
	private String type;
	private double cost;
	
	public Assets(String ownerName, String type, double cost) {
		this.ownerName = ownerName;
		this.type = type;
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("Continue!!!");
			
			if(obj instanceof Assets) {
				System.out.println("Instance of asset");
				
				Assets ref = (Assets)obj;
				if(this.cost == ref.cost && this.ownerName == ref.ownerName && this.type == ref.type) {
					return true;
				}
			}else {
				System.err.println("Not an instance of asset");
			}
		}else {
			System.err.println("Passing Null");
		}
		
		return false;
	}
	
	

}
