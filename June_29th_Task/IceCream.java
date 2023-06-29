class IceCream{
	
	String type="Cone";
	int weight=100;
	String ingredients="Pista";
	int noOfIceCreams;
	
	IceCream(){
		System.out.println("Running default constructor");
	}
	
}


class IceCreamRunner{
	public static void main(String[] args){
		IceCream ref=new IceCream();
		
		System.out.println("Type of the IceCream is " + ref.type);
		System.out.println("Weight of the Cone is : " + ref.weight);
		System.out.println("Ingredient of the IceCream is : " + ref.ingredients);
		System.out.println("No of IceCreams : " + ref.noOfIceCreams);
	}
}