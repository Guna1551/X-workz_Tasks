class Kebab{
	String name;
	double price;
	String hotelName;
	int noOfPieces;
	boolean takeAway;
	
	Kebab(String name){
		
		System.out.println(name);
		
		System.out.println("Name of the Kebab is "+name);
		this.name=name;
		
	}
	Kebab(String name, double price){
		System.out.println("Name of the kebab is "+name);
		System.out.println("Price of the kebab is "+price);
		this.name=name;
		this.price=price;
	
	}
	
	Kebab(String name, int price, String hotelName){
		System.out.println("Name of the kebab is "+name);
		System.out.println("Price of the kebab is "+price);
		System.out.println("Hotel name is "+hotelName);
		this.name=name;
		this.hotelName=hotelName;
		this.price=price;
		
	}
	
	Kebab(String name, int price, String hotelName, int noOfPieces){
		System.out.println("Name of the kebab is "+name);
		System.out.println("Price of the kebab is "+price);
		System.out.println("Hotel name is "+hotelName);
		System.out.println("No Of Pieces "+noOfPieces);
		this.name=name;
		this.hotelName=hotelName;
		this.price=price;
		this.noOfPieces=noOfPieces;
		
	}
	
	
	Kebab(String name, int price, String hotelName, int noOfPieces, boolean takeAway){
		System.out.println("Name of the kebab is "+name);
		System.out.println("Price of the kebab is "+price);
		System.out.println("Hotel name is "+hotelName);
		System.out.println("No Of Pieces "+noOfPieces);
		System.out.println("Take away "+takeAway);
		this.name=name;
		this.hotelName=hotelName;
		this.price=price;
		this.noOfPieces=noOfPieces;
		this.takeAway=takeAway;
		
	}
	
	
	
}



class KebabRunner{
	public static void main(String[] args){
		
		Kebab ref1 = new Kebab("Chicken Kebab");
		Kebab ref2 = new Kebab("Chicken Kebab",1500);
		Kebab ref3 = new Kebab("Chicken Kebab",1500,"Radisson Blu");
		Kebab ref4 = new Kebab("Chicken Kebab",1500,"Radisson Blu",25);
		Kebab ref5 = new Kebab("Chicken Kebab",1500,"Radisson Blu",20,true);
	}
}