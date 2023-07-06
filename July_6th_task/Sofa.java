class Sofa{
	
	String name;
	String type;
	int capacity;
	int price;
	int totalChairs;
	String color;
	int weight;
	String material;
	
	Sofa(String name, String type, int capacity, int price, int totalChairs,String color, int weight, String material){
		
			System.out.println("name : "+name);
			System.out.println("type : "+type);
			System.out.println("capacity : "+capacity);
			System.out.println("price : "+price);
			System.out.println("totalChairs : "+totalChairs);
			System.out.println("color : "+color);
			System.out.println("weight : "+weight);
			System.out.println("material : "+material);
			
			this.name=name;
			this.type=type;
			this.capacity=capacity;
			this.price=price;
			this.totalChairs=totalChairs;
			this.color=color;
			this.weight=weight;
			this.material=material;
	}
	
}


class SofaRunner{
	public static void main(String[] args){
		
		Sofa sofa1 = new Sofa("Sofa1","Sectional Sofa",3,30000,3,"Brown",25,"Nylon");
		Sofa sofa2 = new Sofa("Sofa2","L shape Sofa",7,60000,3,"Black",35,"Nylon");
		Sofa sofa3 = new Sofa("Sofa3","Diwan Sofa",1,3000,3,"Blue",10,"Nylon");
		Sofa sofa4 = new Sofa("Sofa4","Bed Sofa",3,10000,3,"Black",12,"Cotton");
		Sofa sofa5 = new Sofa("Sofa5","Wooden Sofa",5,20000,3,"Brown",30,"Nylon");
		Sofa sofa6 = new Sofa("Sofa6","Royal Sofa",12,300000,3,"Golden",50,"Cotton");
		Sofa sofa7 = new Sofa("Sofa7","Old Sofa",3,30000,3,"Brown",20,"Cotton");
		Sofa sofa8 = new Sofa("Sofa8","Sectional Sofa",3,31000,3,"Brown",28,"Nylon");
		
		
	}
}