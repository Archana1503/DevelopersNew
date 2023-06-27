package com.collectiondemos;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIteratorDivide {
	public static void divideNum(ArrayList<Integer>al) {
		System.out.println("\nFollowing numbers are not didvisibe by 3");
		for(int i=0;i<al.size();i++) {
			if(al.get(i)%3==0)
    {
    	   System.out.println("divisbile by 3 is as follows=="+al.get(i));
       }
		}
		
	}
	public void remove(ArrayList<Integer>al) {
		System.out.println("\nFollowing numbers are not didvisibe by 3");
		 
		Iterator a=al.iterator();
		while(a.hasNext()) {
			int i=(int)a.next();
			if(i%3==0) {
				a.remove();
			}
		}
		System.out.println(al);
	}

	

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list element");
	
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		
		
		
		UsingIteratorDivide u=new UsingIteratorDivide();
		u.divideNum(al);
		u.remove(al);
		
		
		

	}

}
