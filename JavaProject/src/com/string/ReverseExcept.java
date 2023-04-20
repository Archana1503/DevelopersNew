package com.string;

public class ReverseExcept {

	static void printReverse(String str)
	    {
	        // Print first word
	        int i = 0;
	        for (i = 0; i < str.length() && str.charAt(i) != ' '; i++)
	            System.out.print(str.charAt(i)) ;
	     
	        // Print middle words
	        String word = "";
	         
	         
	        for (; i < str.length(); i++) {
	     
	            if (str.charAt(i) != ' ')
	                word += str.charAt(i);
	                 
	            else {
	                    System.out.print(new StringBuilder(word).
	                                reverse().toString() + " ");
	                    word = "";
	            }
	        }
	     
	        // Print last word
	        System.out.print(word + " ");
	    }
	     
	    public static void main(String []args)
	    {
	        String str = "india is best country";
	        printReverse(str);
	    }
	 
	
	

	}


