package com.polymorphism;

abstract class A{           //Abstract Class  
	
	void disp1(){
		System.out.println("class A");
	}
}
abstract class B extends A{ //Abstract Class
	abstract void disp2();  //Abstract Method
}
class C extends B{
	void disp2(){
		System.out.println("class B");
	}
	
	
	


public class AbstractDEmo1 {

	public static void main(String[] args) {
		C c = new C();
		c.disp1();
		c.disp2();
		}  
	}
}