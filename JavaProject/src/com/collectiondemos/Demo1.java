package com.collectiondemos;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList List=new ArrayList();
		List.add(78);
		List.add("pune");
		List.add('c');
		List.add(89.77);
		
		System.out.println(List);
		
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(39);
		a1.add(70);
		a1.add(98);
		a1.add(90);
		a1.add(50);
		System.out.println(a1);

	}

}
