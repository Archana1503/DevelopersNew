package com.loops;

import java.util.Scanner;

public class Trimorphic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter a number to check: ");  
		 
		int num = in.nextInt();  
		int count=0;  
		
		int cube = num*num*num;  
		
		int temp = num;    
		  
		while(temp>0)  
		{  
		count++;  
  
		temp=temp/10;  
		}   
		
		int lastDigit = (int) (cube%(Math.pow(10, count)));   
	  
		if(num == lastDigit)  
		System.out.println(num+ " is an Triomorphic number.");  
		else  
		System.out.println(num+ " is not an Triomorphic number.");  
		}  
		}  

