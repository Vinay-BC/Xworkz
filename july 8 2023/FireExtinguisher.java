class FireExtinguisher{
	String type;
	boolean flamable;
	String chemicalElement;
	float speedOfPressure;
	double price;
	 
	 FireExtinguisher(){
		System.out.println("FireExtinguisher runing with no arguments.....");
	 }
	 
	 FireExtinguisher(String type, boolean flamable, String chemicalElement, float speedOfPressure, double price){
			System.out.println("FireExtinguisher runing with its properties.....");
			this.type=type;
			this.flamable=flamable;
			this.chemicalElement=chemicalElement;
			this.speedOfPressure=speedOfPressure;
			this.price=price;
	 }
	 void instancePrintVariables(){
			System.out.println(this.type);
			System.out.println(this.flamable);
			System.out.println(this.chemicalElement);
			System.out.println(this.speedOfPressure + "Kph");
			System.out.println(this.price);

	 }
}

