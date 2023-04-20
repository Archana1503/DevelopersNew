package com.constructor;

public class Customer {
	 int cust_id;
	 String cust_name;
	 
	 
	 public Customer(){
		 System.out.println("I am customer");
		 
	 }
	 public Customer(int x)
	 {
		 System.out.println("x=" +x);
	 }
	 public Customer(int cid,String cname)
	 {
		 
	 }
	

	public static void main(String[] args) {
		Customer c1=new Customer(10);
		Customer c2=new Customer();
	

	}

}
