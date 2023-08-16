package com.xworkz.aug8th.runner;
import java.util.Scanner;

import com.xworkz.aug8th.app.WashingMachineUser;
import com.xworkz.aug8th.implementor.BoschWashingMachine;
import com.xworkz.aug8th.rule.WashingMachine;
public class WashingMachineRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Machine is on");
		
		System.out.println("Enter the total weight : ");
		int weight = scanner.nextInt();
		
		System.out.println("Enter the total items : ");
		int items = scanner.nextInt();
		
		WashingMachine machine = new BoschWashingMachine();
		
		WashingMachineUser machineUser = new WashingMachineUser();
		machineUser.setItems(items);
		machineUser.setMachine(machine);
		machineUser.setWeight(weight);
		boolean wash =  machineUser.wash();
		boolean dry =  machineUser.dry();
		
		if(wash == true && dry == true) {
			System.out.println("Washing and drying is complete!!!");
		}
		else {
			System.err.println("Cannot wash!!!");
		}
		scanner.close();
	}

}
