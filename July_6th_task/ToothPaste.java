class ToothPaste{
	
	String name;
	String type;
	String flavour;
	int price;
	int totalToothPastes;
	String color;
	int weight;
	String quality;
	
	ToothPaste(String name, String type, String flavour, int price, int totalToothPastes,String color, int weight, String quality){
		
			System.out.println("name : "+name);
			System.out.println("type : "+type);
			System.out.println("flavour : "+flavour);
			System.out.println("price : "+price);
			System.out.println("total ToothPastes : "+totalToothPastes);
			System.out.println("color : "+color);
			System.out.println("weight : "+weight);
			System.out.println("quality : "+quality);
			
			this.name=name;
			this.type=type;
			this.flavour=flavour;
			this.price=price;
			this.totalToothPastes=totalToothPastes;
			this.color=color;
			this.weight=weight;
			this.quality=quality;
	}
	
}


class ToothPasteRunner{
	public static void main(String[] args){
		
		ToothPaste ToothPaste1 = new ToothPaste("ToothPaste1","Ayurvedic","Mint",30,3,"White",250,"Good");
		ToothPaste ToothPaste2 = new ToothPaste("ToothPaste2","Normal","Sweet",60,7,"Silver",350,"Good");
		ToothPaste ToothPaste3 = new ToothPaste("ToothPaste3","Ayurvrdic","Sour",30,4,"Light Blue",100,"Ok");
		ToothPaste ToothPaste4 = new ToothPaste("ToothPaste4","Normal","Spicy",10,8,"Red",120,"Average");
		ToothPaste ToothPaste5 = new ToothPaste("ToothPaste5","Normal","Mint",20,1,"Silver",300,"Good");
		ToothPaste ToothPaste6 = new ToothPaste("ToothPaste6","Ayurvedic","Spicy",30,2,"Golden",500,"Good");
		ToothPaste ToothPaste7 = new ToothPaste("ToothPaste7","Ayurvedic","Unflovoured",30,6,"Silver",200,"Average");
		ToothPaste ToothPaste8 = new ToothPaste("ToothPaste8","Normal","Unflovoured",30,3,"Silver",280,"Good");
		
		
	}
}