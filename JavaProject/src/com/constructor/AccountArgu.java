package com.constructor;//question 5 Define a constructor which takes all arguments and assign those value to member variable
//sop i am in oparameterized constructor

public class AccountArgu {
	long account_no;
	String customer_name;
	public AccountArgu(int accno,String customername) {
		account_no=accno;
		customer_name=customername;
		
		System.out.println("i am in parameterized");
	}
	public void display() {
		System.out.println(+account_no+" "+customer_name+" ");
	}

	public static void main(String[] args) {
		AccountArgu a1=new AccountArgu(55632,"Archana");
		AccountArgu a2=new AccountArgu(12244,"Aniket");//6.in main to create another object of the account 
		//class using the constructor with all arguments and print the member variable values.
		a1.display();
		a2.display();
		
		
	

	}

}
