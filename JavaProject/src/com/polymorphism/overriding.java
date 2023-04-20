package com.polymorphism;

class Bird{
	void fly() {
		System.out.println("every bird can fly");
	}
}
class Hamming extends Bird{
	@Override
	

	public void  fly() {
		System.out.println("Hamming bird can fly upto 300 meter");
	}
}
class Swan extends Bird{
	@Override
	public void fly() {
		System.out.println("Swan can fly upto 20 meter");
	}
	
}
public class overriding {

	public static void main(String[] args) {
		
		//Bird s=new Swan();
		//s.fly();
		Bird h=new Hamming();
		
		h.fly();
	
		
		

	}

}
