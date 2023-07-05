class Sweet{
	
	String name;
	int noOfPieces;
	int price;
	
	Sweet(String name){
		System.out.println("Name of the Sweet is "+name);
		this.name=name;
	}
	
	Sweet(String name, int noOfPieces){
		System.out.println("Name of the Sweet is "+name);
		System.out.println("No of Pieces "+noOfPieces);
		this.name=name;
		this.noOfPieces=noOfPieces;
	}
	
		Sweet(String name, int noOfPieces, int price){
		System.out.println("Name of the Sweet is "+name);
		System.out.println("No of Pieces "+noOfPieces);
		System.out.println("Price "+price);
		this.name=name;
		this.noOfPieces=noOfPieces;
		this.price=price;
	}
	
	
}



class SweetRunner{
	public static void main(String[] args){
		Sweet ref1=new Sweet("Rasmalai");
		Sweet ref2=new Sweet("Rasmalai",20);
		Sweet ref3=new Sweet("Rasmalai",20,250);
	}
}