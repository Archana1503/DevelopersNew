package com.java8feat;


import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExprWithConsumer {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Angular Js");
		al.add("Advance java");
		al.add(".net");
		
		
//		Consumer<ArrayList<String>> c=(s1)->
//		{
//			System.out.println(s1);
//			
//		};
//		c.accept(al);
		
		//System.out.println(al);
		al.forEach(l->System.out.println(l.toUpperCase()));
		

	}

}
