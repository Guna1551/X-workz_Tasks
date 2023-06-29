class Sweet{
	String name="Rasmalai";
	int weight=150;
	String keyIngredient;
	int quantity;
	
	Sweet(){
		System.out.println("Running default constructor!!!");
		
	}
}

class SweetRunner{
	public static void main(String[] args){
	Sweet ref=new Sweet();
	
	System.out.println("Sweet name is "+ ref.name);
	System.out.println("Sweet weight is "+ ref.weight + "grams");
	System.out.println("Key ingridient default value : "+ ref.keyIngredient);
	System.out.println("Sweet quantity default value : "+ ref.quantity);
	}
}