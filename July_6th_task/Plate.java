class Plate{
	
	String name;
	String type;
	boolean design;
	int price;
	int totalPlates;
	String color;
	int weight;
	String shape;
	
	Plate(String name, String type, boolean design, int price, int totalPlates,String color, int weight, String shape){
		
			System.out.println("name : "+name);
			System.out.println("type : "+type);
			System.out.println("design : "+design);
			System.out.println("price : "+price);
			System.out.println("total Plates : "+totalPlates);
			System.out.println("color : "+color);
			System.out.println("weight : "+weight);
			System.out.println("shape : "+shape);
			
			this.name=name;
			this.type=type;
			this.design=design;
			this.price=price;
			this.totalPlates=totalPlates;
			this.color=color;
			this.weight=weight;
			this.shape=shape;
	}
	
}


class PlateRunner{
	public static void main(String[] args){
		
		Plate Plate1 = new Plate("Plate1","Steel Plate",true,300,3,"Silver",25,"Round");
		Plate Plate2 = new Plate("Plate2","Alluminium Plate",false,600,7,"Silver",35,"Round");
		Plate Plate3 = new Plate("Plate3","Silver Plate",true,300,4,"Blue",10,"Round");
		Plate Plate4 = new Plate("Plate4","Glass Plate",true,100,8,"Silver",12,"Square");
		Plate Plate5 = new Plate("Plate5","Steel Plate",false,200,1,"Silver",30,"Round");
		Plate Plate6 = new Plate("Plate6","Golden Plate",true,30,2,"Golden",50,"Square");
		Plate Plate7 = new Plate("Plate7","Silver Plate",true,30,6,"Silver",20,"Square");
		Plate Plate8 = new Plate("Plate8","Plastic Plate",true,31,3,"Silver",28,"Round");
		
		
	}
}