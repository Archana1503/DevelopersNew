package com.loops;

import java.util.Scanner;

public class PowerCalculate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int power;
		
		 System.out.print("Enter Base: ");
		  int base = sc.nextInt();
		  power=base;
		  System.out.print("Enter index: ");
		  int index = sc.nextInt();
		  
		  
		  for (int i=1; i<index; i++){
		         power = power*base;
		  
		  
		  
		

	}
		  System.out.println("Result of "+base+" power "+index+" is "+power);

}
}
