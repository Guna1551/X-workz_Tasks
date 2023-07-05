class Infosys{
	String founderName;
	String founderWifeName;
	int founded;
	int totalEmployees;
	
	Infosys(String founderName, String founderWifeName){
		
		System.out.println("Founder of the Infosys "+founderName);
		System.out.println("Founder Wife name is "+founderWifeName);
		this.founderName=founderName;
		this.founderWifeName=founderWifeName;
		
	}
	
	Infosys(String founderName, String founderWifeName, int founded, int totalEmployees){
		
		this(founderName,founderWifeName);
		
		System.out.println("Founded in the year "+founded);
		System.out.println("Total Employees "+totalEmployees);
		this.founded=founded;
		this.totalEmployees=totalEmployees;
		
	}
	
	
}


class InfosysRunner{
	public static void main(String[] args){
		Infosys infosys = new Infosys("Narayan Murthy","Sudha Murthy",1981,335186);
	}
}