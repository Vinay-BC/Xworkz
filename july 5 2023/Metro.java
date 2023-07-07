class Metro{

	String line;
	int distance;
	String start;
	String destination;
	int capacity;

	Metro(String line, int distance){
		System.out.println("Running class");
		System.out.println("Running class");
		this.line=line;
		this.distance=distance;
	}

	Metro(String line, int distance, String start,String destination, int capacity){
		this(line,distance);

		System.out.println("Running class");
		System.out.println("Running class");
		System.out.println("Running class");
		this.start=start;
		this.destination=destination;
		this.capacity=capacity;
	}

}