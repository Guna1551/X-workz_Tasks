package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.HospitalRule;

public class VisitorsHospitalRule implements HospitalRule{

	@Override
	public void silent() {
		
		System.out.println("Running silent in VIsitorsHospitalRule");
		
	}
	

}
