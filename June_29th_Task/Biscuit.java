class Biscuit{
	
	String name="Dark Fantasy";
	int weight;
	String ingredients;
	int noOfBiscuits=5;
	
	Biscuit(){
		System.out.println("Running default constructor");
	}
	
}


class BiscuitRunner{
	public static void main(String[] args){
		Biscuit ref=new Biscuit();
		
		System.out.println("Name of the Biscuit is " + ref.name);
		System.out.println("Weight of the Biscuit is : " + ref.weight);
		System.out.println("Ingredients of the Biscuit is : " + ref.ingredients);
		System.out.println("No of Biscuit : " + ref.noOfBiscuits);
	}
}