class VegPuff{
	
	String type="Paneer Puff";
	int weight=60;
	String ingredients="Paneer";
	int noOfVegPuffs=30;
	
	VegPuff(){
		System.out.println("Running default constructor");
	}
	
}


class VegPuffRunner{
	public static void main(String[] args){
		VegPuff ref=new VegPuff();
		
		System.out.println("Type of the VegPuff is " + ref.type);
		System.out.println("Weight of the Puff is : " + ref.weight + "grams");
		System.out.println("Ingredient of the Puff is : " + ref.ingredients);
		System.out.println("No of Biscuit : " + ref.noOfVegPuffs);
	}
}