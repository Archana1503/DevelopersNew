package com.exceptionhandling;

public class PropagationUnchecked {
	public void division(int num1,int num2) {
		System.out.println(num1/num2);
		
	}
	public void method1(int num1,int num2){
	division(num1,num2);	
	}
	public void method2(int num1,int num2) {
		try {
			method1(num1,num2);
			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("exception handled");
			e.printStackTrace();
			
		}
		
		
	}

	public static void main(String[] args) {
		PropagationUnchecked p=new PropagationUnchecked();
		p.method2(20, 0);

	}

}
