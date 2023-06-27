package com.labassignmentcolle;//using equalls to method

import java.util.ArrayList;

public class ArylistCpy {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(90);
		al.add(68);
		al.add(76);
		al.add(72);
		
		//display old arraylist
		
System.out.println(al);
ArrayList<Integer>al2=al;


System.out.println("for each");

for(Integer value:al2) {
	System.out.println(value);
}
al2.set(2, 99);

al2.set(1, 77);
System.out.println("After adding 77 to second arraylist"+al2);
System.out.println("Second element"+al2.get(1));
System.out.println("Second element"+al.get(1));
	}

}
