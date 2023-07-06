class Alcohol
{
	String name;
	double price;
	String type;
	boolean takeaway;
	
	Alcohol(String name)
	{
		System.out.println("Running Alcohol");
		this.name=name;
	}
	Alcohol(String name,double price)
	{
		System.out.println("Running Alcohol");
		this.name=name;
		this.price=price;
	}
	Alcohol(String name,double price,String type)
	{
		System.out.println("Running Alcohol");
		this.name=name;
		this.price=price;
		this.type=type;
	}
	Alcohol(String name,double price,String type,boolean takeaway)
	{
		System.out.println("Running Alcohol");
		this.name=name;
		this.price=price;
		this.type=type;
		this.takeaway=takeaway;
	}
	
}