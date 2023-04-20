package com.conditions;
import java.util.Scanner;

public class Divisible5 {



	public static void main(String[] args) {
		int num;
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		 num = sc.nextInt(); // Read user input
		 if(num % 5==0) {
			 System.out.println("Number is divisible by 5");
		 }
		 
		 else
		 {
			 System.out.println("Number is not divisible by 5");
		 }
		
		

	}

}
