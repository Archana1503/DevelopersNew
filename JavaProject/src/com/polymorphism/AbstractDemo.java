package com.polymorphism;

abstract class Vehicle{           //Abstract Class  
	abstract void display1();
	abstract void display2();
	
}  
abstract class Car extends Vehicle{    //Abstract Class
	void display3(){
		System.out.println("class Car");
	}
//	
//	class BMW extends Vehicle{
//		void display1() {
//			System.out.println("class Vehicle");
//		}
//	}
}
abstract class BMW extends Car{   //Abstract Class
	void display4(){
		System.out.println("class BMW"); //
	}
}
class BMW1 extends BMW{
	void display1(){
		
		System.out.println("BMW1"); //
	}

@Override
void display2() {
	System.out.println("overide method");
}
}
	
	
	
public class AbstractDemo {

	public static void main(String[] args) {// Implementation of Abstract method
		
		BMW1 b = new BMW1();
		b.display1();
		b.display2();
		b.display3();
		}  
	}



	// TODO Auto-generated method stub
	



