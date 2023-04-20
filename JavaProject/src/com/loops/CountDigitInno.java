package com.loops;
import java.util.Scanner;

public class CountDigitInno {

	public static void main(String[] args) {
		
		 int num, totalDigits=0;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = sc.nextInt();
	      
	      while(num!=0)
	      {
	        
	         num = num/10;
	         totalDigits++;
	         
	      }
	      
	      System.out.println("\nThe Total Number of Digits = " +totalDigits);
	   }
	}
	
//		
//Scanner sc=new Scanner(System.in);
//
//int number,temp,count=0;
//System.out.println("Enter any no whose number of digits to be calculate");
//number=sc.nextInt();
//temp=number;
//
//while(number!=0)
//{
//	count++;
//	temp=temp/10;
//	
//
//}
//System.out.println("Number of Digits in number="+count);
//
//	}
//
//}
