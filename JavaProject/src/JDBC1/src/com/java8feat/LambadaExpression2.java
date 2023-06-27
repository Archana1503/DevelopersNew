package com.java8feat;


interface cal
{
	int  add(int a,int b);
	
}




public class LambadaExpression2 {

	public static void main(String[] args) {
		cal c=(int a,int b)->{return a+b;};
		System.out.println(c.add(23, 34));

	}

}

