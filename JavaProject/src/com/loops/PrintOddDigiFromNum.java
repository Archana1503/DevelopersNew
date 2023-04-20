package com.loops;
import java.util.Scanner;

public class PrintOddDigiFromNum {
	public void oddNumber(int num)
	{
		int odd=0;
		while(num>0)
		{
			int digit=num%10;
			if(digit%2==1)
			{
				System.out.println( " num is odd");
			}
			else 
			{
				System.out.println( " num is even");
			}
			num=num/10;
			
			
		}
	
	}
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		PrintOddDigiFromNum o = new PrintOddDigiFromNum();
		o.oddNumber(num);
		
	
		
		
	}
}
		
		




