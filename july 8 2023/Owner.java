class Owner{
	
	String ownerName;
	long ownerNum;
	long ownerNetworth;
	String fbId;
	String ownerEmail;
	
	Owner(){
		System.out.println("Owner running with no arguments....");
	}
	
	Owner(String ownerName, long ownerNum, long ownerNetworth, String twiterId, String ownerEmail){
		this.ownerName=ownerName;
		this.ownerNum=ownerNum;
		this.ownerNetworth=ownerNetworth;
		this.fbId=fbId;
		this.ownerEmail=ownerEmail;	
	}
	
	void printIntanceVariables(){
		System.out.println("ownerName:"+ownerName);
		System.out.println("ownerNum:"+ownerNum);
		System.out.println("ownerNetworth:"+ownerNetworth);
		System.out.println("fbId:"+fbId);
		System.out.println("ownerEmail:"+ownerEmail);
	}
}

