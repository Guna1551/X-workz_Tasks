package com.xworkz.aug8th.app;

import com.xworkz.aug8th.rule.Elevator;

public class User {
	
	private Elevator elevator;
	private int MAX_WEIGHT;
	
	public void carryLuggage() {
		if(elevator != null) {
			System.out.println("Elevator Available!!!");
			if(MAX_WEIGHT < 100) {
				System.out.println("Weight is less than 100kg can carry!!!");
				elevator.carryluggage();
			}
			else {
				System.err.println("Weight is more than 100kg cannot carry!!!");
			}
		}
		else {
			System.err.println("Elevator is null cannot carry luggage");
		}
	}

	public Elevator getElevator() {
		return elevator;
	}

	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}

	public int getMAX_WEIGHT() {
		return MAX_WEIGHT;
	}

	public void setMAX_WEIGHT(int mAX_WEIGHT) {
		MAX_WEIGHT = mAX_WEIGHT;
	}

}
