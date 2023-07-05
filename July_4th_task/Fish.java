class Fish{
	String name;
	String type;
	int price;
	String location;
	
	Fish(String name){
		
		System.out.println(name);
		
		System.out.println("Name of the fish is "+name);
		
		
	}
		Fish(String name, String type){
		System.out.println("Name of the fish is "+name);
		System.out.println("Type of the fish is "+type);
		this.name=name;
		this.type=type;
	
	}
	
	Fish(String name, String type, int price){
		System.out.println("Name of the fish is "+name);
		System.out.println("Type of the fish is "+type);
		System.out.println("Price of the fish is "+price);
		this.name=name;
		this.type=type;
		this.price=price;
		
	}
	
	Fish(String name, String type, int price, String location){
		System.out.println("Name of the fish is "+name);
		System.out.println("Type of the fish is "+type);
		System.out.println("Price of the fish is "+price);
		System.out.println("Location is "+location);
		this.name=name;
		this.type=type;
		this.price=price;
		this.location=location;
	}
	
	
	
}



class FishRunner{
	public static void main(String[] args){
		
		Fish ref1 = new Fish("Sword Fish");
		Fish ref2 = new Fish("Jelly Fish","Sea");
		Fish ref3 = new Fish("Golden Fish","River",1000);
		Fish ref4 = new Fish("Shark","Ocean",1000000,"Indian Ocean");
	}
}