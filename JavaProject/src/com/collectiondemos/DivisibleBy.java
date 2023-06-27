package com.collectiondemos;
import java.util.Scanner;//how to display removeed in method remove

import java.util.ArrayList;

public class DivisibleBy {
	 
	
public static void DivideNumber(ArrayList<Integer>al) {
	System.out.println("\nFollowing numbers are  didvisibe by 3");
	for(int i=0;i<al.size();i++) {
		if(al.get(i)%3==0)
{
	   System.out.println(al.get(i));
	  
	   
   }
	}
	}
public static void removeElement(ArrayList<Integer>al) {
	for(int i=0;i<al.size();i++) {
		if(al.get(i)%3==0) {
			al.remove(i);
	
		}
	}
	
}
	
 public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter list element");
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		
	    DivisibleBy d=new DivisibleBy();
		d.DivideNumber(al);
		d.removeElement(al);
		System.out.println("following are not divisible by 3");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		

	}

}
