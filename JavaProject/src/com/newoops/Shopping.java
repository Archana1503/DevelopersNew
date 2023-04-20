package com.newoops;

public class Shopping {

	int product_id;
	String product_name;
	int price;
	int qty;
	int bill;

	public void acceptProductDetails(int pid, String pname, int pprice, int q) {
		product_id = pid;
		product_name = pname;
		price = pprice;
		qty = q;

	}

	public void display() {
		System.out.println(product_id + " " + product_name + " " + price + " " + qty + " " + bill);
	}

	public void calculatebill() {
		if (qty > 0) {
			bill = qty * price;

			System.out.println("Quantity is more than zero");

		} else

		{
			System.out.println("Quantity less  than zero");

		}
	}

	public static void main(String[] args) {
		Shopping shop1 = new Shopping();
		shop1.acceptProductDetails(101, "T-shirt", 600, 2);

		shop1.calculatebill();
		shop1.display();

	}

}
