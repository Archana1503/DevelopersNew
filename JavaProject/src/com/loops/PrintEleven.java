package com.loops;
import java.util.Scanner;

public class PrintEleven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number of terms: ");
		  int n = sc.nextInt();
		  int s = 0, i;                                         
		  for (i = 1; i <= n; i++)                          
		  {
		   s = s * 10 + 1;
		   System.out.print(s + " ");
		  }                                                          
		 }
		

	}


