class Kabab
{
	String name;
	double price ;
	String hotelname;
	int noofpieces;
	boolean takeaway ;
	
	Kabab(String name)
	{
		System.out.println("Running kabab name");
		this.name=name;
	}
	Kabab(String name,double price )
	{
		System.out.println("Running kabab");
		this.name=name;
		this.price=price;
	}
	Kabab(String name,double price,String hotelname)
	{
		System.out.println("Running kabab");
		this.name=name;
		this.price=price;
		this.hotelname=hotelname;
	}
	Kabab(String name,double price,String hotelname,int noofpieces)
	{
		System.out.println("Running kabab");
		this.name=name;
		this.price=price;
		this.hotelname=hotelname;
		this.noofpieces=noofpieces;
	}
	Kabab(String name,double price,String hotelname,int noofpieces,boolean takeaway)
	{
		System.out.println("Running kabab");
		this.name=name;
		this.price=price;
		this.hotelname=hotelname;
		this.noofpieces=noofpieces;
		this.takeaway=takeaway;
	}
	
	
}