class MetroRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main in MetroRunner");
		Metro metro=new Metro("Green",50,"Silk Institute","Nagasandra",200);
		System.out.println("line is : "+metro.line);
		System.out.println("distance is :"+metro.distance);
		System.out.println("start point is :"+metro.start);
		System.out.println("destination is : "+metro.destination);
		System.out.println("capacity of metro is : "+metro.capacity);
	}
} 