class Cake{
	
	String name="Chocolate Cake";
	int weight;
	String ingredients;
	int noOfcakes=5;
	
	Cake(){
		System.out.println("Running default constructor");
	}
	
}


class CakeRunner{
	public static void main(String[] args){
		Cake ref=new Cake();
		
		System.out.println("Name of the cake is " + ref.name);
		System.out.println("Weight of the cake is : " + ref.weight);
		System.out.println("Ingredients of the cake is " + ref.ingredients);
		System.out.println("No of cakes : " + ref.noOfcakes);
	}
}