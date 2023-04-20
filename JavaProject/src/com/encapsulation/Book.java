package com.encapsulation;


public class Book {
	int bid;
	String bname;
	
	Book()
	{
	 this.bname="java";
		
		this.bid=100;
	}
		
		
	Book(int bid,String bname) 
	 {
		this.bid=bid;
		this.bname=bname;
		
	}
	public String toString() {
		return bid+" "+bname+" ";
	}
	
	

	public static void main(String[] args) {
		Book b=new Book(10,"Shams mother");
		
		System.out.println(b);
		Book b1=new Book();
		
		System.out.println(b1);
		
		

	}

}
