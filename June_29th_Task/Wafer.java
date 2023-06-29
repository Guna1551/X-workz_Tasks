class Wafer{
	
	String name="Chocolate wafers";
	int weight;
	String ingredients;
	int noOfWafers=8;
	
	Wafer(){
		System.out.println("Running default constructor");
	}
	
}


class WaferRunner{
	public static void main(String[] args){
		Wafer ref=new Wafer();
		
		System.out.println("Name of the Wafer is " + ref.name);
		System.out.println("Weight of the Wafer is : " + ref.weight);
		System.out.println("Ingredients of the Wafer is : " + ref.ingredients);
		System.out.println("No of Wafers : " + ref.noOfWafers);
	}
}