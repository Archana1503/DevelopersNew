package com.collectiondemos;//by using iterator remaining
import java.util.*;

public class OddPosition {
	
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList();
		al.add(80);
		al.add(70);
		al.add(27);
		al.add(13);
		al.add(91);
		
		//using for loop
		for(int i=0;i<al.size();i++) {
			if(i%2==1) {
				System.out.println(al.get(i));
			}
	}
	
		
	System.out.println("..........");
	
    Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	
	
		if(it.hasNext())
	{
		it.next();
	}
	}
	}
}
	
	
	
	