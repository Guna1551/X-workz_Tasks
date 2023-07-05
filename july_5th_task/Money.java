class Money{
	String country;
	String currency;
	String denomination;
	String type;
	
	Money(String country, String currency){
		System.out.println("Country : "+country);
		System.out.println("Currency : "+currency);
		this.country=country;
		this.currency=currency;
		
	}
	
	Money(String country, String currency, String denomination, String type){
		this(country,currency);
		System.out.println("Denomination : "+denomination);
		System.out.println("Currency type : "+type);
		this.denomination=denomination;
		this.type=type;
	}
}


class MoneyRunner{
	public static void main(String[] args){
		Money money=new Money("India","Rupee","Two hundred","Note");
	}
}