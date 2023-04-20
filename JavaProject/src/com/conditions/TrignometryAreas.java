package com.conditions;
import java.util.Scanner;

public class TrignometryAreas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1.Area of circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Triangle");
		System.out.println("4.Area of Square");
		System.out.println("Choose any one from above");

		int num=sc.nextInt();
		
		switch(num) {
		case 1:
		  System.out.println("Enter redius of circle");
			
			int redius= sc.nextInt();
			double area = 3.14*(redius*redius);
			System.out.println("Area of circle is:"+area);
			break;
			
		
		case 2: System.out.println("Please enter length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int areaRectangle = length * breadth;
        System.out.println("Area of ractangle is: " + areaRectangle);
        break;
			
			
		case 3: System.out.println("Enter Base and height of triangle");
		int base = sc.nextInt();
		int height =sc.nextInt();
		int areaTriangle =base*height/2;
		System.out.println("Area of Triangle is" +areaTriangle);
		break;
			
		case 4: System.out.println("Please enter side of square: ");
        int side = sc.nextInt();
       
        int areaSquare = side * side;
        System.out.println("Area of ractangle is: " + areaSquare);
        break;	
		default:
			System.out.println("Invalid input");
			
		   }
		}
}
			
//		
//case 1: System.out.println("Please enter radius of circle: ");
//double radius = sc.nextFloat();
//double areaCircle = (22 * radius * radius) / 7;
//System.out.println("Area of circle is: " + areaCircle);
//break;
//		// TODO Auto-generated method stub
//
//	}
//
//}
