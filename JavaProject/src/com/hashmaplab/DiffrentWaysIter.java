package com.hashmaplab;
import java.util.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DiffrentWaysIter {
	

	public static void main(String[] args) {
		

       HashMap<String,String> hm = new HashMap<>();
        
        hm.put("Cricket", "Sachin");
        hm.put("Football", "Zidane");
        hm.put("Tennis", "Sania");
        
        Iterator<Map.Entry<String, String>> entrySet = hm.entrySet().iterator();
        
        System.out.println("....Using iterator...");
        while (entrySet.hasNext())
        {
            Map.Entry<String, String> entry = entrySet.next();
            
            System.out.println("Key ="+entry.getKey()+"Value ="+entry.getValue());
        }
        
    System.out.println("..using keySet iterator.....");
	Iterator keySetIterator = hm.keySet().iterator();
    
    while (keySetIterator.hasNext())
    {
        String key = (String) keySetIterator.next();
        
        System.out.println("Key ="+key+"Value ="+hm.get(key));
    }
    
    
    
//    
//    System.out.println("...using for each keyset....");
//    for(Map.Entry<String, String> entry : entrySet)
//    {
//        System.out.println("Key : "+entry.getKey()+"   Value : "+entry.getValue());
//    }
	}
}
