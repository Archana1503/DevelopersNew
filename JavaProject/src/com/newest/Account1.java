package com.newest;

public class Account1 {

	int accountId;
	String accountType;
	String name;
	double balanceAmount;

	public Account1(int i, String type, double amount,String name) {
		this.accountId = i;
		this.accountType = type;
		this.balanceAmount = amount;
		this.name=name;
	}

	public void deposit(double amount) {
		balanceAmount= balanceAmount+amount;
		System.out.println(amount + " has been deposited");
	}



	public void withdraw(double amount) {
		if (amount > balanceAmount) {
			System.out.println("Insufficient balance add money");
		} else {
			balanceAmount = balanceAmount-amount;
			System.out.println( " has been withdrawn"+amount );
		}
	}


	public void displayAccountDetails() {
		System.out.println("Account holder Name: "+name);
		System.out.println("Account id: " + accountId);
		System.out.println("Account Type: " + accountType);
		System.out.println("Account Balance: " + balanceAmount);

	}


	public static void main(String[] args) {

		Account1 acc = new Account1(10, "Savings", 10000,"Archana");
		acc.displayAccountDetails();
		System.out.println(".................");
		acc.withdraw(2000);
		System.out.println(".................");
		acc.displayAccountDetails();
		System.out.println(".................");
		acc.deposit(5000);
		System.out.println(".................");
		acc.displayAccountDetails();
	}

}

 /*
Account holder Name: Archana
Account id: 10
Account Type: Savings
Account Balance: 10000.0
.................
 has been withdrawn2000.0
.................
Account holder Name: Archana
Account id: 10
Account Type: Savings
Account Balance: 8000.0
.................
5000.0 has been deposited
.................
Account holder Name: Archana
Account id: 10
Account Type: Savings
Account Balance: 13000.0




*/