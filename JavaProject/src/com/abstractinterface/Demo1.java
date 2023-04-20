package com.abstractinterface;


interface Addable{
	int x=50;
	
}
abstract class Addition{
	int y=100;
	
}
class Calculate extends Addition implements Addable{
	int z;
	public void Calculate() {
		int z=x+y;
		System.out.println(z);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Calculate answer=new Calculate();
		answer.Calculate();
		

	}

}
