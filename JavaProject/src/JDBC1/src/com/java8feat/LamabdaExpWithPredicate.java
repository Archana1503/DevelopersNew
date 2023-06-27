package com.java8feat;



import java.util.ArrayList;
import java.util.function.Predicate;

public class LamabdaExpWithPredicate {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Angular Js");
		al.add("Advance java");
		al.add(".net");
		
		
		Predicate<String> p=s->s.length()>8;
		
		for(String s:al)
		{
			if(p.test(s))
			{
				System.out.println(s);
			}

		}
				

	}

}
