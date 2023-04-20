package com.conditions;
import java.util.Scanner;
public class CapitalOrSmall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabate");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("Entered "+" "+ch+" "+"is uppercase");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("Entered "+" "+ch+" "+"is lowercase");
		}
		else
		{
			System.out.println("Entered "+" "+ch+" "+"is not Alphabate");
		}
			
		// TODO Auto-generated method stub

	}
}


