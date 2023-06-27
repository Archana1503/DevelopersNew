package com.collectiondemos;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task1FloatReverse {

	public static void main(String[] args) {
		 ArrayList arrList = new ArrayList();
		 arrList.add(90.30f);
		 arrList.add(80.30f);
		 arrList.add(30.50f);
		 arrList.add(60.60f);
		 
		
		System.out.println(arrList);
		
		System.out.println("........");//1st way
		 // System.out.println(arrList.size());//display size of arr

		  ListIterator < Float > listIterator = arrList.listIterator(); 
		  
		  while(listIterator.hasNext())
		  {
			  System.out.println(listIterator.next());
		  }
		  
		  while(listIterator.hasPrevious())
		  {
			  System.out.println(listIterator.previous());
		  }
	
	}

}
