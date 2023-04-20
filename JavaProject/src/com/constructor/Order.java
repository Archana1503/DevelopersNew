package com.constructor;

public class Order {
	int order_id;
	int order_qty;
	String order_item;
	
	public Order(int oid,int oqty, String oitem){
		order_id =oid;
		 order_qty=oqty;
		order_item=oitem;
		
	}

	public  void displayOrder(){
		System.out.println(order_id+" "+order_qty+" "+order_item);
		
		
	}
	public static void main(String[] args) {
		Order myorder= new Order(1,10,"Pendrive");
		myorder.displayOrder();
		
		

	}

}
