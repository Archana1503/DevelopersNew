package com.boxingunboxing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ListCity {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter city name");
a1.add(sc.next());
a1.add(sc.next());
a1.add(sc.next());
a1.add(sc.next());
a1.add(sc.next());
a1.add(sc.next());
for(int i=0;i<a1.size();i++) {
	System.out.println(a1.get(i));
}
System.out.println("....");
for(String s:a1) {
	System.out.println(s);
}
System.out.println("....");

Iterator<String>itr=a1.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
	
}
System.out.println("Trevesre in forword");

ListIterator<String>Itr=a1.listIterator();
while(Itr.hasNext()) {
	//Itr.add("Banglore"); not possible add while trversing forward and backwaord
	//but we can remove data
	System.out.println(itr.next());
}

ListIterator<String>lit=a1.listIterator(a1.size());
while(lit.hasPrevious()) {
	System.out.println(lit.previous());
	
	
	
}


	}

}
