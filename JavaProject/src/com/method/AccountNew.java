package com.method;

public class AccountNew {

	int aid;
	String atype;
	int abal;

	// accept account details
	public void acceptDetails(int id, String type, int bal) {
		aid = id;
		atype = type;
		abal = bal;
		System.out.println();

	}

	// display account details
	public void displayDetails() {
		System.out.println(+aid + " " + atype + " " + abal + " ");

	}

	public void widrowMoney(int amount) {
		if (abal < amount) {
			System.out.println("your amout is insufficient");
		} else {
			abal -= amount;
			System.out.println(amount + "has been withdraw");
		}

	}

	public void depositeMoney(int amount) {

		abal += amount;
		System.out.println(amount + " money has been deposited");

	}

	public static void main(String[] args) {

		AccountNew a = new AccountNew();

		a.acceptDetails(10, "saving", 5000);
		a.displayDetails();
		System.out.println(".............");
		a.widrowMoney(2000);
		System.out.println(".............");
		a.displayDetails();
		System.out.println(".............");
		a.depositeMoney(500);
		System.out.println(".............");
		a.displayDetails();

	}
}