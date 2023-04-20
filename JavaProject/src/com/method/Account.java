package com.method;

public class Account {
	int aid;
	String atype;
	int abal;
	
//accept account details
	public void acceptDetails(int id,String type,int bal) {
		aid=id;
		atype=type;
		abal=bal;
		System.out.println();
		
	}
	//display account details
	public void displayDetails() {
		System.out.println(+aid+" "+atype+" "+abal+" "  );
		
	}
	public void widrowMoney() {
		
	}
	public void depositeMoney() {
		
	}
	
	public static void main(String[] args) {
		Account a=new Account();
		
		a.acceptDetails(10,"saving",5000);
		a.displayDetails();
		
		
		

	}

}
