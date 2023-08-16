package com.xworkz.aug8th.app;

import com.xworkz.aug8th.rule.WaterPurifier;

public class Harsha {
	
	private int totalCapacity;
	private WaterPurifier purifier;
	
	public boolean purify(WaterPurifier purifier) {
		if(purifier != null) {
			System.out.println("Purifier is available");
			if(totalCapacity<purifier.TOTAL_CAPACITY) {
				System.out.println("Within the max limit can purify");
				purifier.filter();
				return true;
			}
			else {
				System.err.println("The water is more than max capacity cannot purify");
			}
		}
		else {
			System.err.println("It seems purifier is null");
		}
		return false;
	}

}
