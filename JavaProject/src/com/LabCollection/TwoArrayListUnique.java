package com.LabCollection;
import java.util.ArrayList;

public class TwoArrayListUnique {
	
	public static void findDublicate(ArrayList<String>al,ArrayList<String>al2) {
		al.addAll(al2);
		//System.out.println(al);
		ArrayList<String>al3=new ArrayList<String>();
		for(int i=0;i<al.size();i++) {
			int count=0;
			for(int j=0;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					count++;
					//break;
				}
			}
			if(count<2) {
				al3.add(al.get(i));
			}
		}
		System.out.println("\nUnique element ArrayList:");
		System.out.println(al3);
		
		
	}
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("mango");
		al.add("apple");
		al.add("kiwi");
		al.add("pineapple");
		System.out.println("first array list"+al);
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("mango");
		al2.add("banana");
		al2.add("kiwi");
		al2.add("watermelon");
		System.out.println("SEcond array list"+al2);
		
		
		
		TwoArrayListUnique u=new TwoArrayListUnique();
		findDublicate(al,al2);
		

	}

}
