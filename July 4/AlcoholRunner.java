class AlcoholRunner
{
	public static void main(String[] args)
	{
		System.out.println("running alcohol main");
		
		Alcohol ref=new Alcohol("old mounk");
		System.out.println("name is:"+ref.name);
		System.out.println("price is"+ref.price);
		System.out.println("type is"+ref.type);
		System.out.println("takeaway is"+ref.takeaway);
		
		Alcohol ref1=new Alcohol("old mounk",500);
		System.out.println("name is:"+ref1.name);
		System.out.println("price is"+ref1.price);
		System.out.println("type is"+ref1.type);
		System.out.println("takeaway is"+ref1.takeaway);
		
		Alcohol ref2=new Alcohol("old mounk",500,"rum");
		System.out.println("name is:"+ref2.name);
		System.out.println("price is"+ref2.price);
		System.out.println("type is"+ref2.type);
		System.out.println("takeaway is"+ref2.takeaway);
		
		Alcohol ref3=new Alcohol("old mounk",500,"rum",true);
		System.out.println("name is:"+ref3.name);
		System.out.println("price is"+ref3.price);
		System.out.println("type is"+ref3.type);
		System.out.println("takeaway is"+ref3.takeaway);
	}
}