package com.collectiondemos;
import java.util.ArrayList;

public class MethodsArrList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("pune");
		al.add("mumbai");
		System.out.println(al);
		
		
		al.add(0,"Banglore");//add element ata 0 location.
		System.out.println(al);
		
		
		//SET method
		System.out.println("...relpace elemnt at index position...");
		al.set(0,"goa");
		System.out.println(al);
	
		//REMOVE method
		al.remove(0);
		System.out.println(al);
		
		al.add("Delhi");
		System.out.println(al);
		
		
		ArrayList<String>al2=new ArrayList();
		al2.add("nasik");
		System.out.println(al2);
		System.out.println(al2);
		al2.addAll(0,al);
		System.out.println(al2);

	}

}
