package com.xworkz.aug8th.runner;

import com.xworkz.aug8th.app.ViratKohli;
import com.xworkz.aug8th.implementor.SamsungSmartWatch;
import com.xworkz.aug8th.rule.SmartWatch;

public class SmartWatchRunner {

	public static void main(String[] args) {
		
		SmartWatch watch = new SamsungSmartWatch();
		
		ViratKohli kohli = new ViratKohli(watch);
		kohli.seeTime();

	}

}
