package com.task28;
import java.util.Scanner;

//Calculate average of prime numner in between 1to 10

public class PrimeNoInbtnN {
	
	
	

	public static void main(String[] args) {
	
		int sum=0;
		int average;
		
		for(int num=1;num<=10;num++)
		{
			boolean isPrime =true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
				
			}
			
		}
		if(isPrime) {
		
			
			
			
			System.out.println(num);
		
			sum=sum+num;
			System.out.println(sum);
			
		}
		
		
			
		}
		
	

	}

}
