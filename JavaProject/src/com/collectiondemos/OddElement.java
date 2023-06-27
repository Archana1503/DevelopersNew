package com.collectiondemos;
import java.util.ArrayList;
import java.util.Iterator;



public class OddElement {



	public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList();
	al.add(78);
	al.add(80);
	al.add(33);
	al.add(13);
	al.add(90);
	
System.out.println("...using for loop ...");
	for(int i=0;i<al.size();i++)
	{
		if(al.get(i)%2==1)
		{
			
		System.out.println(al.get(i));
		}
	}
	System.out.println("..using for each loop...");
	for(Integer n:al) {
		if(n%2==1) {
			System.out.println(n);
		}
	}
	System.out.println("...using iterator....");
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext()) {
		Integer num=itr.next();
		if(num%2==1) {
			System.out.println(num);
		}
	}
	}

}
