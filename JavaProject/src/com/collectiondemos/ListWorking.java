package com.collectiondemos;//to string methos is present inside so it dirctly 
//display list instaed of hash code
import  java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListWorking {

	public static void main(String[] args) {
  ArrayList<String>a1=new ArrayList();
  a1.add("red");
  a1.add("blue");
  a1.add("green");
  a1.add("black");
  System.out.println(a1);
  
  System.out.println("........");//1st way
  System.out.println(a1.size());//display size of arr

  for(int i=0;i<a1.size();i++) {
	  System.out.println(a1.get(i));//display array loop using traditional
  }
  System.out.println("....Display using enhance for loop..");
  for(String s:a1) {
	  System.out.println(s);
  }
  System.out.println("......");
  Iterator<String>itr=a1.iterator();
  while(itr.hasNext()) //while loop is used because we dont no exactly iteration
  {
	  System.out.println(itr.next());//return element and shift cursor to next
  }
  System.out.println("traverse in forword and backword direction..iterator");
  ListIterator<String>Itr=a1.listIterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
  
	  System.out.println("......forword...");

	  ListIterator<String>ltr=a1.listIterator();
	  
	  while(Itr.hasNext()) {
		  System.out.println(Itr.next());
		//  Itr.next();
  }
	  
	  System.out.println("......backword....");
  
	
	while(Itr.hasPrevious())
	{
		System.out.println(Itr.previous());
	}

	}
}