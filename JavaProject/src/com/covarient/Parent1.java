package com.covarient;

public class Parent {
	

	Parent1 show()
	{
		System.out.println("parent method");
		return this;
		
	}
	Child move()
	{
		System.out.println("move method");
		return new Child();
	}
}
class Child extends Parent1
{
	Child show()
	{
		super.show();
		System.out.println("child method");
		return this;
	}
	Child show1()
	{
		return new Child();
	}
}
public class Parent1{

	public static void main(String[] args) {
		Parent p =new Child();
		Child c=(Child)p;
		c.show();
	}
		

	}

}
