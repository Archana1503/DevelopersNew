package com.exceptionhandling;
import java.util.Scanner;

public class ChkBinaryLogic {


   static void numBinaryOrNot(int num)
   {
    boolean isBinary = true;
 
    int Num1 = num;
 
    while (Num1 != 0)
    {
      int temp = Num1%10;  
 
      if(temp > 1)
       {
         isBinary = false;
         break;
       }
        else
       {
         Num1 = Num1/10;    
      }
    }
 
     if (isBinary)
     {
        System.out.println(num+" is a binary number");
     }
     else
     {
        System.out.println(num+" is not a binary number");
     }
   }
 
		
		 public static void main(String[] args)
		  {
		    Scanner sc=new Scanner(System.in);
		    
		    System.out.println("Enter a number");
		    int num = sc.nextInt();
		 
		    numBinaryOrNot(num);
		  }
}

		