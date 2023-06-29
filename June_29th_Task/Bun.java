class Bun{
	
	String name="Cream Bun";
	int weight;
	String ingredients;
	int noOfBuns=6;
	
	Bun(){
		System.out.println("Running default constructor");
	}
	
}


class BunRunner{
	public static void main(String[] args){
		Bun ref=new Bun();
		
		System.out.println("Name of the Bun is " + ref.name);
		System.out.println("Weight of the Bun is : " + ref.weight);
		System.out.println("Ingredients of the Bun is : " + ref.ingredients);
		System.out.println("No of Buns : " + ref.noOfBuns);
	}
}