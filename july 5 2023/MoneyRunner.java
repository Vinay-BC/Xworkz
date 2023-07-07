class MoneyRunner{
	public static void main(String[] money){
		System.out.println("Running main...");
		Money amt = new Money("Spain","Euro","The Euro(€)","Coin");
		System.out.println("Country :"+amt.country);
		System.out.println("Currency :"+amt.currency);
		System.out.println("Denomination :"+amt.denomination);
		System.out.println("Type :"+amt.type);
	}
}	