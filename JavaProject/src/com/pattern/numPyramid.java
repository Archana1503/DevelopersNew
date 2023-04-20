package com.pattern;//not properly working
import java.util.Scanner;

public class numPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		int i,j;
		for(i=1; i<=rows; i++){
		   for(j=1; j<=rows-i; j++){
		   System.out.print(" ");//print "space" for the initial part of the pyramid 
		}
		   for(j=1; j<=i; j++){
		   System.out.print((char)(char)(j+64)+" ");

		System.out.println();
		}
		}
	}
}
		

	


