package com.covarient;

class Bank
{
	Loan applyLoan()
	{
		System.out.println("apply loan");
		return new Loan();
	}
}
class HDFC extends Bank
{
	GoldLoan applyLoan() {
		System.out.println("Gold Loan");
		return new GoldLoan();
	}
}

public class BankMain {
	

	public static void main(String[] args) {
		Bank b=new HDFC();
		//HomeLoan l=b.applyLoan();
		//Syso(l);
		Loan l1=new GoldLoan();
		GoldLoan g=(GoldLoan)l1;
		System.out.println(g);
		
		
		Loan L=new GoldLoan();
		Object o=new String();
		Loan L2=new GoldLoan();
		System.out.println(L2);
		
		
	

	}

}
