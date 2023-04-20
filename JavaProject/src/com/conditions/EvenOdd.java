package com.conditions;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		 num = sc.nextInt(); // Read user input
		 if(num % 2==0) {
			 System.out.println("Number is even");
		 }
		 
		 else
		 {
			 System.out.println("Number is odd");
		 }
		
		

	}

}
