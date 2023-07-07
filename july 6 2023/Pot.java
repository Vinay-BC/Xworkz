class Pot{
	String brand;
	String type;
	double price;
	String color;
	int size;
	int capacity;
	String shop;
	int weight;

	Pot(String brand,String type,double price,String color,int size,int capacity,String shop,int weight)
	{
		System.out.println("Running Pot");
		this.brand=brand;
		this.type=type;
		this.price=price;
	    this.color=color;
        this.size=size;
	    this.capacity=capacity;
	    this.shop=shop;
	    this.weight=weight;
	}
}