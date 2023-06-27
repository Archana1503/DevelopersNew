package com.mapcls;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;


public class ArlstFrqncy {
	

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("nasik");
		al.add("pune");
		al.add("mumbai");
		System.out.println(al);
		//System.out.println("frequency"+Collections.frequency(al, "pune"));
		
		
		//Object a[]=al.toArray();not necessary
	
		//System.out.println(Arrays.toString(a));
		
		HashMap<String,Integer>hm=new HashMap<>();
		for(int i=0;i<al.size();i++) {
			boolean visited=false;
			int count=1;
			for(int j=i-1;j>=0;j--) {
				if(al.get(i)==al.get(j)) {
					visited=true;
				}
			}
			if(visited==false) {
				for(int k=i+1;k<al.size();k++) {
					if(al.get(i)==al.get(k)) {
						count++;
					}
				}
				System.out.println("Element Frequency"+al.get(i)+" "+count);
			
		
					}
				}
			}
			
		}
		

	


