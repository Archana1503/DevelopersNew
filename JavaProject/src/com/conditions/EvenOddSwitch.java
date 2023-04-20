package com.conditions;
import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		switch(num%2) {
		case 0:
			System.out.println("Number is even");
			break;
		case 1:
			System.out.println("Number is Odd");
		break;
		default:
			System.out.println("Invalid input");
			
				
		}
		// TODO Auto-generated method stub

	}

}
