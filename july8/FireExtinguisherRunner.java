class FireExtinguisherRunner{
	public static void main(String[] args){
		System.out.println("Fire Extinguisher is running........");
		
		FireExtinguisher ref = new FireExtinguisher();
		FireExtinguisher ref1 = new FireExtinguisher("FE_V ", true, "carbon-based solids", 94, 6789.00);
		ref1.instancePrintVariables();
		
		System.out.println("Updated variables......");
		FireExtinguisher ref2 = new FireExtinguisher();
		ref2.type= "FE_X";
	    ref2.flamable= false;
		ref2.chemicalElement= "Dry Powder";
		ref2.speedOfPressure= 96;
		ref2.price= 5629.00;
		ref2.instancePrintVariables();
		
		
		
	}
}