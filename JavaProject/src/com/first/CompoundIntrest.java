package com.first;
import java.util.Scanner;

public class CompoundIntrest {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter priciple amount");
		int principle =sc.nextInt();
		 
		
		
		System.out.println("Enter intrest Rate");
		int Rate =sc.nextInt();
		
		
		System.out.println("Enter Time period in Year");
		int Time =sc.nextInt();
		
		int CI=principle*((1+Rate/100));//P(R+1/T)^n//Math.pow(b, e)
		System.out.println("compound intrest is"+CI);
		
		
		


	}

	}


		
		


	
		

	

//}uld use Math.pow(X, 0.5






