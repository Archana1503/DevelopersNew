package com.exceptionhandling;//unchecked exception

public class ThrowDemo1 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("He is not eligible");
			
		}
		else {
			System.out.println(" eligible for voting");
		}
		
	}

	public static void main(String[] args) {
		ThrowDemo1 t=new ThrowDemo1();
		
		t.validate(30);

	}

}
