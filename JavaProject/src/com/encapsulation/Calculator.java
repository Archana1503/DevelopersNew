package com.encapsulation;//polymorphism

public class Calculator {
	public void calculateArea(int l,int b)
	{
		System.out.println("Area of Rectangle="+(l*b));
	}
	public void calculateArea(int h,float b)
	{
	System.out.println("Area of traingle"+(0.5*b*h));
	}
	public void calculateArea(int s) {
		System.out.println("Area of Square"+(s*s));
	}
	public void calculateArea(int r,double PI){
		
			System.out.println("Area of circle="+(PI*r*r));
		}
	

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.calculateArea(7);
		c.calculateArea(5,3.14);
		c.calculateArea(8,0.5f);
		c.calculateArea(3,4);
		
		

	}

}
