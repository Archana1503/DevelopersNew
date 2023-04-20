package com.sunday;
import java.util.Scanner;

public class PrimeNo {
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter number");

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
	
	
		
			boolean isPrime=true;
			for(int i=2;i<num;i++)
			{
				if (num%i==0)
				{
					isPrime=false;
					break;
				}
			}
				if(isPrime)
				{
					System.out.println("num is prime"+num);
					
				}
				else
				{
					System.out.println("nume is not prime number"+num);
				}
				
				
				
			}
		}
	

