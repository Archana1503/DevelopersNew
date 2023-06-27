package com.exceptionhandling;

public class NonBinaryException extends Exception {


		NonBinaryException()
		{
			System.out.println("not binary");
		}
		NonBinaryException(String msg)
		{
			super(msg);
		}
		

}
