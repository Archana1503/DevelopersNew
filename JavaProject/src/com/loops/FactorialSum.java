package com.loops;
import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);///for number 20
		
		{
			  int fact = 1;
			  int sum = 0;
			  int i, j = 1;
			  for (i = 1; i <= 60; i++)
			  {
			    for (j = 1; j <= i; j++)
			    {
			      fact = fact * j;
			  }
			  sum += fact;
			
			 
			  }
			  System.out.println ("sum = " + sum);
			 }
	}
}