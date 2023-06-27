package com.exceptionhandling;

public class NestedTry {

	public static void main(String[] args)
	{//outer main try
		try {
			try {
				try {
					int arr[]= {1,2,3};
					System.out.println(arr[10]);
				}
				catch(ArithmeticException e) {
					System.out.println(e);
					
				}
				
			}
			catch(ArithmeticException e1) {
				System.out.println(e1);
				
			}
		}
		catch(ArrayIndexOutOfBoundsException  e2) {
			//e2.printStackTrace();
			System.out.println(e2);
			
		}
		catch(Exception e3) {
			System.out.println(e3);
			System.out.println("mainBlock");
		}

	}

}
