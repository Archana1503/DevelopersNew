package com.exceptionhandling;

public class IncorrectLenthException extends RuntimeException {
	IncorrectLenthException(){
		System.out.println("  short length not allowed");
	}

//	public static void main(String[] args) {
//		
//	}
		IncorrectLenthException(String msg){
			super(msg);
		}

	}


