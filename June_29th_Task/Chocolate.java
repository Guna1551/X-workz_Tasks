class Chocolate{
	
	String name="Milky Bar";
	int weight;
	String ingredients;
	int noOfChocolates=15;
	
	Chocolate(){
		System.out.println("Running default constructor");
	}
	
}


class ChocolateRunner{
	public static void main(String[] args){
		Chocolate ref=new Chocolate();
		
		System.out.println("Name of the Chocolate is " + ref.name);
		System.out.println("Weight of the Chocolate is : " + ref.weight);
		System.out.println("Ingredients of the Chocolate is : " + ref.ingredients);
		System.out.println("No of Chocolates : " + ref.noOfChocolates);
	}
}