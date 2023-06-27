package com.hashmaplab;
import java.util.*;
		  
		class IterationDemo 
		{
		    public static void main(String[] arg)
		    {
		        Map<String,String> url = new HashMap<String,String>();
		      
		       
		        url.put("Facebook", "www.facebook.com");
		        url.put("Gmail", "www.gmail.com");
		        url.put("Twitter", "www.Twitter.com");
		        url.put("Tutorial", "www.Tutoraial.com");
		          
		        // using iterators
		        Iterator<Map.Entry<String, String>> itr = url.entrySet().iterator();
		          
		        while(itr.hasNext())
		        {
		             Map.Entry<String, String> entry = itr.next();
		             System.out.println("Key = " + entry.getKey() + 
		                                 ", Value = " + entry.getValue());
		        }
		    }
		}