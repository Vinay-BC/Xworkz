class ScissorRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in ScissorRunner");
		Scissor ref=new Scissor("raven");
		System.out.println("brand is :" +ref.brand);
		System.out.println("color is:" +ref.color);
		System.out.println("type is:" +ref.type);
		System.out.println("size is:" +ref.size);
		System.out.println("price is:" +ref.price);
		System.out.println("material is:" +ref.material);
		
		Scissor ref5=new Scissor("raven","black");
		System.out.println("brand is :" +ref5.brand);
		System.out.println("color is:" +ref5.color);
		System.out.println("type is:" +ref5.type);
		System.out.println("size is:" +ref5.size);
		System.out.println("price is:" +ref5.price);
		System.out.println("material is:" +ref5.material);
		
		Scissor ref1=new Scissor("raven","black","sharp");
		System.out.println("brand is :" +ref1.brand);
		System.out.println("color is:" +ref1.color);
		System.out.println("type is:" +ref1.type);
		System.out.println("size is:" +ref1.size);
		System.out.println("price is:" +ref1.price);
		System.out.println("material is:" +ref1.material);
		
		
		Scissor ref2=new Scissor("raven","black","sharp","tailor");
		System.out.println("brand is :" +ref2.brand);
		System.out.println("color is:" +ref2.color);
		System.out.println("type is:" +ref2.type);
		System.out.println("size is:" +ref2.size);
		System.out.println("price is:" +ref2.price);
		System.out.println("material is:" +ref2.material);
		
		Scissor ref3=new Scissor("raven","black","sharp","tailor",'m');
		System.out.println("brand is :" +ref3.brand);
		System.out.println("color is:" +ref3.color);
		System.out.println("type is:" +ref3.type);
		System.out.println("size is:" +ref3.size);
		System.out.println("price is:" +ref3.price);
		System.out.println("material is:" +ref3.material);
		
		Scissor ref4=new Scissor("raven","black","sharp","tailor",'m',100);
		System.out.println("brand is :" +ref4.brand);
		System.out.println("color is:" +ref4.color);
		System.out.println("type is:" +ref4.type);
		System.out.println("size is:" +ref4.size);
		System.out.println("price is:" +ref4.price);
		System.out.println("material is:" +ref4.material);
		
		Scissor ref6=new Scissor("raven","black","sharp","tailor",'m',100,"steel");
		System.out.println("brand is :" +ref6.brand);
		System.out.println("color is:" +ref6.color);
		System.out.println("type is:" +ref6.type);
		System.out.println("size is:" +ref6.size);
		System.out.println("price is:" +ref6.price);
		System.out.println("material is:" +ref6.material);
		
	}
}