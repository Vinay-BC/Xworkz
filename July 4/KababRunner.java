class KababRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in KababRunner");
		Kabab ref=new Kabab("mamu ");
		System.out.println("name is:"+ref.name);
		System.out.println("price is :"+ref.price);
		System.out.println("hotel name is"+ref.hotelname);
		System.out.println("noofpieces is :"+ref.noofpieces);
		System.out.println("take way :"+ref.takeaway);
		
		
		Kabab ref1=new Kabab("mamu",100);
		System.out.println("name is:"+ref1.name);
		System.out.println("price is :"+ref1.price);
		System.out.println("hotel name is"+ref1.hotelname);
		System.out.println("noofpieces is :"+ref1.noofpieces);
		System.out.println("take way :"+ref1.takeaway);
		
		
		Kabab ref2=new Kabab("mamu",100,"mamu kabab");
		System.out.println("name is:"+ref2.name);
		System.out.println("price is :"+ref2.price);
		System.out.println("hotel name is"+ref2.hotelname);
		System.out.println("noofpieces is :"+ref2.noofpieces);
		System.out.println("take way :"+ref2.takeaway);
		
		
		Kabab ref3=new Kabab("mamu",100,"mamu kabab",8);
		System.out.println("name is:"+ref3.name);
		System.out.println("price is :"+ref3.price);
		System.out.println("hotel name is"+ref3.hotelname);
		System.out.println("noofpieces is :"+ref3.noofpieces);
		System.out.println("take way :"+ref3.takeaway);
		
		
		Kabab ref4=new Kabab("mamu",100,"mamu kabab",8,true);
		System.out.println("name is:"+ref4.name);
		System.out.println("price is :"+ref4.price);
		System.out.println("hotel name is"+ref4.hotelname);
		System.out.println("noofpieces is :"+ref4.noofpieces);
		System.out.println("take way :"+ref4.takeaway);
	}
}