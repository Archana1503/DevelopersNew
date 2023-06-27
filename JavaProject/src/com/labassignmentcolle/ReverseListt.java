package com.labassignmentcolle;
import java.util.Scanner;
import java.util.ArrayList;

public class ReverseListt {
	 public static void  reverseArrayList(ArrayList<Integer> arraylist)
	    {
	        // Arraylist for storing reversed element
	       
	        for (int i = 0; i < arraylist.size() / 2; i++) {
	         Integer temp = arraylist.get(i);
	            arraylist.set(i, arraylist.get(arraylist.size() - i - 1));
	            arraylist.set(arraylist.size() - i - 1, temp);
	        }
	 
	        // Return the reversed arraylist
	       
	    }
	 
	    // Iterate through all the elements and print
	    public void printElements(ArrayList<Integer> arraylist)
	    {
	        for (int i = 0; i < arraylist.size(); i++) {
	            System.out.print(arraylist.get(i) + " ");
	        }
	    }
	

	public static void main(String[] args) {
		ReverseListt r = new ReverseListt();
		 
        
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
 
       
        arraylist.add(23);
        arraylist.add(34);
        arraylist.add(24);
        arraylist.add(50);
        arraylist.add(80);
        arraylist.add(13);
        
        System.out.print("Elements before reversing: ");
        System.out.println(arraylist);
        
       // r.printElements(arraylist);
       // arraylist = r.reverseArrayList(arraylist);
        r.reverseArrayList(arraylist);
        System.out.print("\nElements after reversing: ");
        System.out.println(arraylist);
        
	

	}

}






