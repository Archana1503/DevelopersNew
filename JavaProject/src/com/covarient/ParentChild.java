package com.covarient;

public class ParentChild extends Parent1{

	@Override
	public void Test(int x) {
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		
		ParentChild o = new ParentChild();
		o.Test();
		o.Test(600);
	}
}
