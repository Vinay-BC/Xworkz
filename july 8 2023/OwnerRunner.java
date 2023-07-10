class OwnerRunner{
	public static void main(String[] args){
		
		System.out.println("OwnerRunner is running");
		
		Owner ref = new Owner();
		ref.printIntanceVariables();
		System.out.println(" ");
		
		Owner ref1 = new Owner("Vinay", 93808639, 33146541, "Vinay@10", "Vinay2002@gmail.com");
		ref1.printIntanceVariables();
		System.out.println(" ");
		
		Owner ref2 = new Owner();
		ref2.ownerName="Vinu";
		ref2.ownerNum=123456;
		ref2.ownerNetworth=96513213;
		ref2.fbId="Vinu";
		ref2.ownerEmail="Vinu07@gmail.com";
		ref2.printIntanceVariables();

	}
}
