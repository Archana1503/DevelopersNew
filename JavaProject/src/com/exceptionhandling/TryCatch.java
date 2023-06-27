package com.exceptionhandling;//we can use printstacktrace or syso.../
//but printstacktrace shows line wh

//exact lione where exception occur


public class TryCatch {

	public static void main(String[] args) {
		System.out.println("hi");
		try {
		int x=10;
		int ans=x/0;
		
System.out.println(ans);
		}
	catch(ArithmeticException e)
		{
		//System.out.println(e);
		
		e.printStackTrace();
		} 
		
		
System.out.println("hello java");
	}

}
