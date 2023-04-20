package com.staticdemos;

public class StaticDemo2 {
	static int x=10;
	int y=50;
	public void change() {
		x=20;
	}
	public static void show() {
		x=30;
		System.out.println(x);
		StaticDemo1 s=new StaticDemo1();
		System.out.println(s.y);
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(StaticDemo1.x);
		StaticDemo1 d=new StaticDemo1();
		

	}

}
