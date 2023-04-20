package com.conditions;
import java.util.Scanner;


public class DivisiblefivAndThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if((num%3==0)&&(num%5==0))
		{
			System.out.println("Given number is divisible by 3 and 5");
		}
		else
			System.out.println("Given number is not divisible by 3 and 5");
		// TODO Auto-generated method stub1

	}

}
