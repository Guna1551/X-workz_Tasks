class Stove{
	
	String name;
	String type;
	boolean design;
	int price;
	int totalStoves;
	String color;
	int weight;
	String shape;
	
	Stove(String name, String type, boolean design, int price, int totalStoves,String color, int weight, String shape){
		
			System.out.println("name : "+name);
			System.out.println("type : "+type);
			System.out.println("design : "+design);
			System.out.println("price : "+price);
			System.out.println("total Stoves : "+totalStoves);
			System.out.println("color : "+color);
			System.out.println("weight : "+weight);
			System.out.println("shape : "+shape);
			
			this.name=name;
			this.type=type;
			this.design=design;
			this.price=price;
			this.totalStoves=totalStoves;
			this.color=color;
			this.weight=weight;
			this.shape=shape;
	}
	
}


class StoveRunner{
	public static void main(String[] args){
		
		Stove Stove1 = new Stove("Stove1","Steel Stove",true,3000,3,"Silver",250,"Square");
		Stove Stove2 = new Stove("Stove2","Alluminium Stove",false,6000,7,"Silver",350,"Square");
		Stove Stove3 = new Stove("Stove3","Silver Stove",true,3000,4,"Blue",100,"Square");
		Stove Stove4 = new Stove("Stove4","Glass Stove",true,1000,8,"Silver",120,"Square");
		Stove Stove5 = new Stove("Stove5","Steel Stove",false,2000,1,"Silver",300,"Square");
		Stove Stove6 = new Stove("Stove6","Golden Stove",true,3000,2,"Golden",500,"Square");
		Stove Stove7 = new Stove("Stove7","Silver Stove",true,3000,6,"Silver",200,"Square");
		Stove Stove8 = new Stove("Stove8","Plastic Stove",true,3100,3,"Silver",280,"Square");
		
		
	}
}