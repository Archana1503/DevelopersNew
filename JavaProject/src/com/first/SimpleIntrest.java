package com.first;
import java.util.Scanner;


public class SimpleIntrest {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter priciple amount");
		int principle =sc.nextInt();
		
		 
		
		
		System.out.println("Enter intrest Rate");
		int Rate =sc.nextInt();
		
		
		System.out.println("Enter Time period in Year");
		int Time =sc.nextInt();
		
		int SI=(principle*Rate*Time)/100;
		System.out.println("simple intrest is"+SI);
		
		
		
		// TODO Auto-generated method stub

	}

}

