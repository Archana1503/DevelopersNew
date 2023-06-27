package com.LabCollection;
import java.util.ArrayList;

public class ArrayLengthNe {
	public static void largeLength(ArrayList<String>al) {
		for(int i=0;i<al.size();i++) {
			if(al.get(i).length()>7) {
				String str=al.get(i);
				al.remove(str);
				i--;
//				al.remove(i);
				
			}
			
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
	al.add("sunday");
	al.add("monday");
	al.add("tuesday");
	al.add("wednesday");
	al.add("thursday");
	al.add("friday");
	al.add("saturday");
	System.out.println(al);
	ArrayLengthNe a=new ArrayLengthNe();
	a.largeLength(al);

	}

}
