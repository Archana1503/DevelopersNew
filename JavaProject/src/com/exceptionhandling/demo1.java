package com.exceptionhandling;

public class demo1 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4};int x = 20;
		try
		{
			System.out.println("hello");
			//System.out.println(x/0);
		}
		finally {
			System.out.println("finally block");
		}//try and finally  doesnt work together.shows output but doesn
//handle exception
	}

	
}
