package com.newoops;//7.write a program to create multiple object of one type only eg.Rectangler1=new Rectangle,r2=new Rectangle()://creating two objects

public class Rectangle {
	int length;
	int width;
	
public void acceptDetails(int l,int w) {
	length=l;
	width=w;
}
	
	public void display() {
		System.out.println(length+" "+width+" ");
		
	}
	
	

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		r1.acceptDetails(10,5);
		r1.display();
		
		
		Rectangle r2=new Rectangle();
		r2.acceptDetails(20, 30);
		r2.display();
		

	}

}
