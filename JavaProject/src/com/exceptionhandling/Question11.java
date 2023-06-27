package com.exceptionhandling;
class Store {
	int noOfItemsAvaiable = 10;
	int maximumLevel = 20;
	int minimumLevel = 5;

	public void addItem() throws ItemStockOverFlowException {
		noOfItemsAvaiable++;
		if (noOfItemsAvaiable > maximumLevel) {
			throw new ItemStockOverFlowException("Excedes the Maximun Level");
		} else {
			System.out.println("Item Added...");
		}
	}

	public void removeItem() throws ItemStockUnderFlowException {
		noOfItemsAvaiable--;
		if (noOfItemsAvaiable < minimumLevel) {
			throw new ItemStockUnderFlowException("Can not go below minimun Level");
		} else {
			System.out.println("Item Removed...");
		}
	}

	public void checkStock() {
		System.out.println("Total Items: " + noOfItemsAvaiable);
	}
}

class ItemStockOverFlowException extends Exception {
	ItemStockOverFlowException(String msg) {
		super(msg);
	}
}

class ItemStockUnderFlowException extends Exception {
	public ItemStockUnderFlowException(String msg) {
		super(msg);
	}
}


public class Question11 {

	public static void main(String[] args) {

		Store s = new Store();
		try {

			s.addItem();
//			s.addItem();
//			s.addItem();
//			s.addItem();
//			s.addItem();
//			s.addItem();
//			s.addItem();

		} catch (ItemStockOverFlowException e) {
		
			System.out.println(e);
		}

		try {
			s.removeItem();
//			s.removeItem();
//			s.removeItem();
//			s.removeItem();
//			s.removeItem();
//			s.removeItem();
//			s.removeItem();
//			s.removeItem();
//			s.removeItem();
//			s.removeItem();
//			s.removeItem();

		} catch (ItemStockUnderFlowException e1) {
		
			System.out.println(e1);
		}

	}
	}


