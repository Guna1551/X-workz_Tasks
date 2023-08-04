package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.VTURules;

public class StudentsVTURule implements VTURules{
	
	@Override
	public void attendance() {
		System.out.println("Running attendance in StudentsVtuRule");
	}

}
