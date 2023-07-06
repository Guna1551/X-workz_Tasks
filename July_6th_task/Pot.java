class Pot{
	
	String name;
	String type;
	int capacity;
	int price;
	int totalPots;
	String color;
	int weight;
	String shape;
	
	Pot(String name, String type, int capacity, int price, int totalPots,String color, int weight, String shape){
		
			System.out.println("name : "+name);
			System.out.println("type : "+type);
			System.out.println("capacity : "+capacity);
			System.out.println("price : "+price);
			System.out.println("total Pots : "+totalPots);
			System.out.println("color : "+color);
			System.out.println("weight : "+weight);
			System.out.println("shape : "+shape);
			
			this.name=name;
			this.type=type;
			this.capacity=capacity;
			this.price=price;
			this.totalPots=totalPots;
			this.color=color;
			this.weight=weight;
			this.shape=shape;
	}
	
}


class PotRunner{
	public static void main(String[] args){
		
		Pot pot1 = new Pot("Pot1","Mud Pot",1,300,3,"Brown",25,"Round");
		Pot pot2 = new Pot("Pot2","Cement Pot",1,600,7,"Black",35,"Round");
		Pot pot3 = new Pot("Pot3","Mud Pot",1,300,4,"Blue",10,"Round");
		Pot pot4 = new Pot("Pot4","Plastic Pot",1,100,8,"Black",12,"Square");
		Pot pot5 = new Pot("Pot5","Cement Pot",1,200,1,"Brown",30,"Round");
		Pot pot6 = new Pot("Pot6","Mud Pot",1,30,2,"Golden",50,"Square");
		Pot pot7 = new Pot("Pot7","Plastic Pot",1,30,6,"Brown",20,"Square");
		Pot pot8 = new Pot("Pot8","Plastic Pot",1,31,3,"Brown",28,"Round");
		
		
	}
}