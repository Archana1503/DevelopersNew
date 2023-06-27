package com.labassignmentcolle;
import java.util.ArrayList;

public class DisplayUsingIndex {
public  ArrayList<String> displayWithIndex(ArrayList<String> al)
    {
	 
	 for (int i = 0; i < al.size(); i++) {
        System.out.print(al.get(i) + " ");
    
		
	}return al;
    }

	public static void main(String[] args) {
		DisplayUsingIndex d=new DisplayUsingIndex ();
		ArrayList<String>al=new ArrayList<>(); 
		al.add("sunday");
		al.add("monday");
		al.add("tuesday");
		al.add("wednesday");
		al.add("thurday");
		
		d.displayWithIndex(al);
		
		

	}

}
