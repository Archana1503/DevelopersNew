package com.encapsulation;
import java.util.Scanner;

public class AdditionDigit {
	
	
	public void FirstLastSum(int n)
	{
		int sum=0;
		int last=n%10;
		int first=10;
		while(n>0)
		{
			first=n%10;
			n=n/10;
		}
		System.out.println(first+" "+last);
		
		}
		
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number");
		int num;
		AdditionDigit A=new AdditionDigit();
		A.FirstLastSum(num);
		
		
		

	}

}
