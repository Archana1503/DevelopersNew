package com.exceptionhandling;//checked exception
//throw checked exception it is must to to handle the exception using catch block or method 
//must declsre it using throw decleration.

public class ThrowCheckedException {
	public static void m1() {
		throw new NullPointerException("null value");
		
	}
	public static void n1() {
		m1();
		
	}
	public static void p1() {
		try {
			n1();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
p1();
System.out.println("done....");
	}

}
