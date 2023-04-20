package com.sunday;
import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		
		int num=32135632;
		int count=0;
		int i=0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter number to be search");
		int n=Sc.nextInt();
		
		while(num>0)
		{
			int digit=num%10;
			if(digit==n) 
			{
				count++;
				
			}
			num=num/10;
		}
				
				System.out.println("occuance is"+count );
				
		
			
			
			
	
			
			
			
			
			
			
		}

	
		
	}


