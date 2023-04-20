package com.constructor;//1.create account with member variable long accountno,string customername

public class Account {
	long account_no;
	String customer_name;
	public Account() {
		System.out.println("print member variable value");//2.in main create a new object of account 
		//class and print member variable value
	}
	public void display() {
		
   account_no=65543444;
   customer_name="Archana";
		
		
	}

	public static void main(String[] args) {
		
		Account a1=new Account();
		Account a2=new Account();
		System.out.println(a1.account_no+" "+a1.customer_name);//shows zero and null
		
		//display value of object
		//a1.display();
		//System.out.println();
	

	}

}

//till question num 4
