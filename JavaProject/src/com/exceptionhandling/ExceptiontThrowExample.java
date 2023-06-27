package com.exceptionhandling;
class ArithmeticTest{
	public void division(int num1,int num2) {
		try {
			
		System.out.println(num1/num2);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Remaining code");
		
	}
}


public class ExceptiontThrowExample {

	public static void main(String[] args) {
	
		ArithmeticTest a=new ArithmeticTest();
		a.division(20,0);
	}

}



