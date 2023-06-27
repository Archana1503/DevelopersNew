package com.mapcls;
import java.util.*;
import java.util.Map.Entry;

public class DisplayMp {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1,"Rose");
		hm.put(5,"jasmine");
		hm.put(3,"Lotus");
		hm.put(7,"Daisy");
		hm.put(11,"Rose");
		
		System.out.println("....1st way......");
		System.out.println(hm);
		System.out.println("....2nd way......");
		for(Map.Entry<Integer,String>m:hm.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
		
		}
		System.out.println("...3rd way......");
		Set s=hm.keySet();
		System.out.println(s);//return all keys 
		
		//Iterator<Integer>itr=s.iterator();
		
//		while(iterator.hasNext()) {
//			Integer iterator.next();
//			System.out.println(str+" "+hm.get(str));
//		
		
		
		
		Iterator <Integer> itr = s.iterator();       
		while(itr.hasNext())  
		{  
		int key=(int)itr.next();  
		System.out.println(key+" "+hm.get(key));  
	}
	}
}
		
