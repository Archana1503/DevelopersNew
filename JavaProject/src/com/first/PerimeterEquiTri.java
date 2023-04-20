package com.first;//perimeter of right angle triangle

import java.util.Scanner;

public class PerimeterEquiTri {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
	 double perimeter;
		
		System.out.println("Enter one side of right angle traingle");
		a=sc.nextInt();
		System.out.println("Enter another side of right angle traingle");
		b=sc.nextInt();
		//perimeter=sc.nextFloat();
		perimeter = a+b+(Math.sqrt(a+b));
		System.out.println("perimeter of right angle traingle is"+perimeter);
		
		
		
		
		
		

	}

}