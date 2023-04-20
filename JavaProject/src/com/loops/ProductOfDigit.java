package com.loops;
import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter Number: ");
		  int number = sc.nextInt();
		  int remainder, temp,  product=1;
		  temp = number;
		  while (temp!=0){
			  remainder = temp % 10;
			  
			  product = product * remainder;
			  temp = temp / 10;
		  }
			System.out.println("Product of digits of Number "+product);
		}
}
			
	