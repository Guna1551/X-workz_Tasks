package com.xworkz.aug3.app.runner;

import com.xworkz.aug3.app.ApplierPatentRules;
import com.xworkz.aug3.app.CustomerBankRule;
import com.xworkz.aug3.app.CustomerSaloonRule;
import com.xworkz.aug3.app.CustomersHotelRule;
import com.xworkz.aug3.app.CustomersPubRule;
import com.xworkz.aug3.app.CustomersTheaterRule;
import com.xworkz.aug3.app.EmployeeCompanyRule;
import com.xworkz.aug3.app.IndianArmyRule;
import com.xworkz.aug3.app.PassengersAirportRule;
import com.xworkz.aug3.app.PassengersMetroRule;
import com.xworkz.aug3.app.PeopleHomeRule;
import com.xworkz.aug3.app.StudentsHostelRule;
import com.xworkz.aug3.app.StudentsVTURule;
import com.xworkz.aug3.app.VisitorsHospitalRule;
import com.xworkz.aug3.app.rules.AirportRules;
import com.xworkz.aug3.app.rules.ArmyRule;
import com.xworkz.aug3.app.rules.BankRule;
import com.xworkz.aug3.app.rules.CompanyRules;
import com.xworkz.aug3.app.rules.HomeRules;
import com.xworkz.aug3.app.rules.HospitalRule;
import com.xworkz.aug3.app.rules.HostelRules;
import com.xworkz.aug3.app.rules.HotelRules;
import com.xworkz.aug3.app.rules.MetroRules;
import com.xworkz.aug3.app.rules.Patent;
import com.xworkz.aug3.app.rules.PubRules;
import com.xworkz.aug3.app.rules.SaloonRules;
import com.xworkz.aug3.app.rules.TheaterRules;
import com.xworkz.aug3.app.rules.VTURules;

public class Runner {

	public static void main(String[] args) {
		
		ArmyRule armyRule = new IndianArmyRule();
		armyRule.firing();
		
		AirportRules airportRules = new PassengersAirportRule();
		airportRules.boarding();
		
		BankRule bankRule = new CustomerBankRule();
		bankRule.loan();
		
		CompanyRules companyRules = new EmployeeCompanyRule();
		companyRules.timings();
		
		HomeRules homeRules = new PeopleHomeRule();
		homeRules.cleaning();
		
		HospitalRule hospitalRule = new VisitorsHospitalRule();
		hospitalRule.silent();
		
		HostelRules hostelRules = new StudentsHostelRule();
		hostelRules.timing();
		
		HotelRules hotelRules = new CustomersHotelRule();
		hotelRules.entry();
		
		MetroRules metroRules = new PassengersMetroRule();
		metroRules.entry();
		
		Patent patent = new ApplierPatentRules();
		patent.design();
		
		PubRules pubRules = new CustomersPubRule();
		pubRules.age();
		
		SaloonRules saloonRules = new CustomerSaloonRule();
		saloonRules.hairCut();
		
		TheaterRules theaterRules = new CustomersTheaterRule();
		theaterRules.seating();
		
		VTURules vtuRules = new StudentsVTURule();
		vtuRules.attendance();
		

	}

}
