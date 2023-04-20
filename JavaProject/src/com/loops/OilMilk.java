package com.loops;

import java.util.Scanner;

public class OilMilk {

	public static void main(String[] args) {
		int m=40,o=50, x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input in ltr milk");
		x=sc.nextInt();
		System.out.println("Input in ltr oil");
		y=sc.nextInt();
		
		for(x=0;x<=6;x++)
			for(y=0;y<=9;y++)
			{
				if(4*x+5*y>=50)
				{
					x=(50-5*y)/4;
					y=(50-4*x)/5;
				System.out.println("milk is"+x);
				System.out.println("oil is"+x);
				}
				else
				{System.out.println("milk and oil total is less than 500 Rs");
			}
		
//		if(4*x+5*y>=50)
//		{
//			System.out.println("milk"+x);
//		}
//		else
//			System.out.println("milk and oil total is less than 500");
//	

	}

}
}
