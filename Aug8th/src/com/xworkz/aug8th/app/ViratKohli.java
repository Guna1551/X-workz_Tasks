package com.xworkz.aug8th.app;

import com.xworkz.aug8th.rule.SmartWatch;

public class ViratKohli {
	
	private SmartWatch watch;
	
	public ViratKohli(SmartWatch watch) {
		this.watch=watch;
	}
	
	public void seeTime() {
		if(watch!=null) {
			System.out.println("watch is not null continue...");
			this.watch.showTime();
		}
		else {
			System.err.println("It seems Smart watch is null!!!");
		}
	}

}
