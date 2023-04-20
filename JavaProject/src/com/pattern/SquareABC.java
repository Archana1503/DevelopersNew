package com.pattern;

import java.util.Scanner;

public class SquareABC {

	public static void main(String[] args) {
		// size
		Scanner sc = new Scanner(System.in);//row=4 print
		 
        System.out.println("Number of rows you want in this pattern?");
 
        int rows = sc.nextInt();
 
	    
	    

	    
	    for (int i = 1; i < rows; i++) {
	      for (int j = 1; j < rows; j++) {
	        System.out.print(j);
	      }
	      System.out.println();

	}

	}
}
