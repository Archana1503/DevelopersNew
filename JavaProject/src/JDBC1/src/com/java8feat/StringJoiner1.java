package com.java8feat;



import java.util.StringJoiner;

public class StringJoiner1 {

	public static void main(String[] args) {
		StringJoiner s=new StringJoiner(" ");
		s.add("java");
		s.add("programming");
		s.add("language");
		
		System.out.println(s);
		
		
		StringJoiner s1=new StringJoiner(" ");
		s.add("java");
		s.add("programming");
		s.add("language");
		
		s.merge(s1);
		
		System.out.println(s);
		
	}

}

