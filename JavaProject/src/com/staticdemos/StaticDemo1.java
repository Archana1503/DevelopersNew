package com.staticdemos;

public class StaticDemo1 {
	static int x=10;
	public void change() {
		x=20;
	}
	public void show() {
		x=30;
		System.out.println(x);
	}


	public static void main(String[] args) {
		

		System.out.println(x);
		StaticDemo1 d =new StaticDemo1();
		//d.change();
		d.show();
	}
	
}
