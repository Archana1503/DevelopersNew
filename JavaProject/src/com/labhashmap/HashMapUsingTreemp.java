package com.labhashmap;
import java.util.*;

public class HashMapUsingTreemp {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap();
		hm.put(1, "Jasmine");
		hm.put(5, "Rose");
		hm.put(3, "daizy");
		hm.put(4, "jui");
		hm.put(7, "Rosee");
		System.out.println(hm);
		TreeMap<Integer,String>tmp=new TreeMap(hm);
		for(Map.Entry<Integer, String>m:tmp.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		

	}

}
