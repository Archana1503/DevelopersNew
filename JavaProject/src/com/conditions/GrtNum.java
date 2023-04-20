package com.conditions;

import java.util.Scanner;

public class GrtNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int num1,num2,num3, Temp1,Temp2;
		System.out.println("Enter the number1");
		
		 num1= sc.nextInt();
		 System.out.println("Enter the number2");
			
		 num2 = sc.nextInt();
		 System.out.println("Enter the number3");
			
		 num3 = sc.nextInt();
		 
		 if (num1>num2) 
		 {
		  Temp1=num1;
		  //System.out.println("largest number is"+Temp1);
		 }
		 else if(num2>num1)
		 {
			 Temp2=num2;
			 
			 
			 System.out.println("largest number is"+Temp);
			 
		 }
		
		 //else if(temp>num3)
		 
		 else
		 {
			 System.out.println("num3 is largest number"+num3);
		 }
		 
		

	}

}
