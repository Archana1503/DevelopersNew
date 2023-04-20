package com.first;
import java.util.Scanner;


public class FindAngle {

	public static void main(String[] args) {
		int a, b, c;
	    Scanner sc=new Scanner(System.in);
	    //Input two angles of the triangle 
	    System.out.println("Enter First angles of triangle: ");
	    a=sc.nextInt();
	    System.out.println("Enter Second angles of triangle: ");
	    b=sc.nextInt();;

	    
	    c = 180 - (a + b);

	    
	    System.out.println("Third angle of the triangle = "+c);
	}
		// TODO Auto-generated method stub

	}


