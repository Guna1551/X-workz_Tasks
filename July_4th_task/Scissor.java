class Scissor{
	String brand;
	double price;
	String color;
	String type;
	String usage;
	String size;
	String material;
	
	Scissor(String brand){
		
		System.out.println(brand);
		
		System.out.println("brand of the Scissor is "+brand);
		this.brand=brand;
		
	}
	Scissor(String brand, double price){
		System.out.println("brand of the Scissor is "+brand);
		System.out.println("Price of the Scissor is "+price);
		this.brand=brand;
		this.price=price;
	
	}
	
	Scissor(String brand, double price, String color){
		System.out.println("brand of the Scissor is "+brand);
		System.out.println("Price of the Scissor is "+price);
		System.out.println("Color is "+color);
		this.brand=brand;
		this.color=color;
		this.price=price;
		
	}
	
	Scissor(String brand, int price, String color, String type){
		System.out.println("brand of the Scissor is "+brand);
		System.out.println("Price of the Scissor is "+price);
		System.out.println("Color is "+color);
		System.out.println("Type is "+type);
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.type=type;
		
	}
	
	
	Scissor(String brand, int price, String color, String type, String usage){
		System.out.println("brand of the Scissor is "+brand);
		System.out.println("Price of the Scissor is "+price);
		System.out.println("COlor is "+color);
		System.out.println("Type is "+type);
		System.out.println("usage "+usage);
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.type=type;
		this.usage=usage;
		
	
	}
	
	Scissor(String brand, int price, String color, String type, String usage, String size){
		System.out.println("brand of the Scissor is "+brand);
		System.out.println("Price of the Scissor is "+price);
		System.out.println("Color is "+color);
		System.out.println("Type is "+type);
		System.out.println("usage "+usage);
		System.out.println("size "+size);
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.type=type;
		this.usage=usage;
		this.size=size;
	}
	
	Scissor(String brand, int price, String color, String type, String usage, String size, String material){
		System.out.println("brand of the Scissor is "+brand);
		System.out.println("Price of the Scissor is "+price);
		System.out.println("color is "+color);
		System.out.println("Type is "+type);
		System.out.println("usage "+usage);
		System.out.println("size "+size);
		System.out.println("materia "+material);
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.type=type;
		this.usage=usage;
		this.size=size;
		this.material=material;
	}
	
	
}



class ScissorRunner{
	public static void main(String[] args){
		
		Scissor ref1 = new Scissor("Prestige");
		Scissor ref2 = new Scissor("Prestige",45);
		Scissor ref3 = new Scissor("Prestige",45,"Red");
		Scissor ref4 = new Scissor("Prestige",45,"Red","Normal");
		Scissor ref5 = new Scissor("Prestige",45,"Red","Normal","Househod");
		Scissor ref6 = new Scissor("Prestige",45,"Red","Normal","Househod","Small");
		Scissor ref7 = new Scissor("Prestige",45,"Red","Normal","Househod","Small","Steel");
	
	}
	
	
}

























