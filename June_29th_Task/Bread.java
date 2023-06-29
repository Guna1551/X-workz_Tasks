class Bread{
	
	String type="Eggless";
	int weight=50;
	String ingredients="Maida";
	int noOfBreads;
	
	Bread(){
		System.out.println("Running default constructor");
	}
	
}


class BreadRunner{
	public static void main(String[] args){
		Bread ref=new Bread();
		
		System.out.println("Type of the Bread is " + ref.type);
		System.out.println("Weight of the Bread is : " + ref.weight);
		System.out.println("Ingredient of the Bread is : " + ref.ingredients);
		System.out.println("No of Bread : " + ref.noOfBreads);
	}
}