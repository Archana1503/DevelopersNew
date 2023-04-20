package com.pattern;

import java.util.Scanner;

public class LowerNumberRightAngl {

	public static void main(String[] args) {
		int i,j,n;
		   System.out.print("Input number of rows : ");
		 Scanner sc = new Scanner(System.in);
				    n = sc.nextInt();
	
		 for ( i = n - 1; i >= 1; i--) {
		      
		      for ( j = 1; j <= i; j++) {
		        System.out.print(j + " ");
		      }
		      System.out.println();

	}

	}
}
