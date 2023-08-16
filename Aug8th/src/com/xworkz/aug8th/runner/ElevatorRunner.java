package com.xworkz.aug8th.runner;

import com.xworkz.aug8th.app.User;
import com.xworkz.aug8th.implementor.MitsubishiElevator;
import com.xworkz.aug8th.rule.Elevator;

public class ElevatorRunner {

	public static void main(String[] args) {
		
		int weight = 80;
		
		Elevator elevator = new MitsubishiElevator();
		
		User user = new User();
		user.setElevator(elevator);
		user.setMAX_WEIGHT(weight);
		user.carryLuggage();
	}

}
