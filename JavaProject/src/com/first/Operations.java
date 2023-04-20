package com.first;
import java.util.*;

public class Operations {

	public static void main(String[] args) {
		int num1, num2, add, sub, mul,div;
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		 num1 = sc.nextInt(); // Read user input

		System.out.println("Enter the number");
		
		 num2 = sc.nextInt(); // Read user input
		
	
		
		add = num1 +num2;
		sub = num1-num2;
		div = num1/num2;
		mul= num1*num2;
		

		 System.out.println(num1 + " + "+num2 +" = " + (num1 +num2 ));
		 System.out.println(num1 + " - "+num2 +" = " + (num1- num2 ));
		 
		
		 System.out.println(num1 + " / "+num2 +" = " + (num1 /num2 ));
		 System.out.println(num1 + " *10 "+num2 +" = " + (num1*num2 ));
		 
		 
		 
		
		// TODO Auto-generated method stub

	}

}
