package com.conditions;
import java.util.Scanner;
public class PosNegZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Given number is positive");
			
		}
		else if(num<0)
		{
			System.out.println("Given number is negatiive");
		}
		else
		{
			System.out.println("Given number is zero");
			
			
			
		}
			
		// TODO Auto-generated method stub

	}

}
