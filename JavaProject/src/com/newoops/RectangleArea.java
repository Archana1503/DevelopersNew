package com.newoops;//calculate area of rectangle que10

public class RectangleArea {
	int length;
	int width;
	float Area;
	
public void acceptDetails(int l,int w) {
	length=l;
	width=w;
}
public void CalculateArea() {
	Area=length*width;
}
	
	public void display() {
		System.out.println(length+" "+width+" "+Area+" ");
		
	}
	
	

	public static void main(String[] args) {
		
		RectangleArea r1=new RectangleArea();
		r1.acceptDetails(10,5);
		r1.CalculateArea();
		r1.display();
		
		
		RectangleArea r2=new RectangleArea();
		r2.acceptDetails(20, 30);
		r2.CalculateArea();
		r2.display();
		

	}

}
