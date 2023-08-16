package com.xworkz.aug8th.app;

import com.xworkz.aug8th.rule.WashingMachine;

public class WashingMachineUser {
	
	private WashingMachine machine;
	private int items;
	private int weight;
	
	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setMachine(WashingMachine machine) {
		this.machine=machine;
	}

	
	public boolean wash() {
		if(machine!=null) {
			System.out.println("Machine availble can wash!!!");
			if(items<WashingMachine.TOTAL_ITEMS) {
				System.out.println("Items is less than maximum, can wash!!!");
				if(weight<WashingMachine.TOTAL_WEIGHT) {
					System.out.println("Weight is less than maximum weight can wash!!!");
					machine.wash();
					return true;
				}
				else {
					System.err.println("Weight is more than maximum weight cannot wash...");
					return false;				}
			}
			else {
				System.err.println("Items is reached maximum cannot wash...");
				return false;
			}
		}
		else {
			System.err.println("It seems machine is null!!!");
			return false;
		}
	}
	
	public boolean dry() {
		if(machine!=null) {
			System.out.println("Machine available can dry!!!");
			return true;
		}
		else {
			return false;
		}
	}

}
