class Metro{
	
	String line;
	int distance;
	String start;
	String destination;
	int capacity;
	
	Metro(String line, int distance){
		System.out.println("Metro line is "+line);
		System.out.println("Total distance is "+distance);
		this.line=line;
		this.distance=distance;
	}
	
	Metro(String line, int distance, String start,String destination, int capacity){
		this(line,distance);
		
		System.out.println("Start : "+start);
		System.out.println("Destination : "+destination);
		System.out.println("Capacity :"+capacity);
		this.start=start;
		this.destination=destination;
		this.capacity=capacity;
	}
	
}

class MetroRunner{
	public static void main(String[] args){
		Metro metro=new Metro("Green",50,"Silk Institute","Nagasandra",200);
	}
}