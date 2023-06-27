package com.exceptionhandling;

public class MultiCatchBlock {

	public static void main(String[] args) {
		
 int a[]= {2,4,5};
 
 try {
	 System.out.println(a[7]/0);
 }
 catch (ArithmeticException e) {
	 System.out.println(e);
	 
	}
 catch (NullPointerException e) {
	 System.out.println(e);
 }
 catch (StringIndexOutOfBoundsException i) {
	 System.out.println(i);
 }
 catch(Exception t) {
	 System.out.println(t);
 }
 System.out.println("hello");
	}

}
