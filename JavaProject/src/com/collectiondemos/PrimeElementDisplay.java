package com.collectiondemos;

import java.util.ArrayList;

public class PrimeElementDisplay {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(20);
		al.add(88);
		al.add(7);
		System.out.println("..given array list....");
		System.out.println(al);
	
		for(int i=0;i< al.size();i++){
			int count=0;
			
			for(int j=2;j<al.get(i);j++) {
			if(al.get(i)%j==0) {
				count++;
			}
			
		}
			if(count==0)
			{
				System.out.println(al.get(i)+"is prime no");
			
			}
			

	
}
}



	
	
}



