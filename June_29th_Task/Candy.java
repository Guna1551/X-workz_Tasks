class Candy{
	
	String name="Eclairs";
	int weight;
	String ingredients;
	int noOfCandies=20;
	
	Candy(){
		System.out.println("Running default constructor");
	}
	
}


class CandyRunner{
	public static void main(String[] args){
		Candy ref=new Candy();
		
		System.out.println("Name of the Candy is " + ref.name);
		System.out.println("Weight of the Candy is : " + ref.weight);
		System.out.println("Ingredients of the Candy is : " + ref.ingredients);
		System.out.println("No of Candies" + ref.noOfCandies);
	}
}