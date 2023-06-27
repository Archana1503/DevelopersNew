package com.collectiondemos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NonGenericExample {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(78);
		a1.add("pune");
		a1.add('c');
		a1.add(89.77);
		
		System.out.println(a1);
		 System.out.println("........");//1st way
		  System.out.println(a1.size());//display size of arr

		  for(int i=0;i<a1.size();i++) {
			  System.out.println(a1.get(i));//display array loop using traditional
		  }
		  System.out.println("....Display using enhance for loop..");
		  
		  for(Object o :a1) {
			  System.out.println(o);
		  }
		  System.out.println("......");
		  Iterator<Object>itr=a1.iterator();
		  while(itr.hasNext()) //while loop is used because we dont no exactly iteration
		  {
			  System.out.println(itr.next());//return element and shift cursor to next
		  }
		  System.out.println("traverse in forword and backword direction..iterator");
		  ListIterator<Object>Itr=a1.listIterator();
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