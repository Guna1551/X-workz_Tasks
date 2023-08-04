package com.xworkz.aug3.app;

import com.xworkz.aug3.app.rules.CompanyRules;

public class EmployeeCompanyRule implements CompanyRules{
	
	@Override
	public void timings() {
		System.out.println("Running timings in EmployeeCompanyRule");
	}

}
