package com.collectiondemos;//sortiong of integer type of arraylist using for loop
  import java.util.ArrayList;
	
  public class SortingOfArrayList {
	 
	  public static void main(String[] args) {
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    al.add(20);
	    al.add(40);
	    al.add(30);
	    al.add(77);
	    al.add(101);
	    System.out.println("...unsorted arraylist...");
	    System.out.println(al);
	    for (int i = 0; i < al.size(); i++) {
	      for (int j = i + 1; j < al.size(); j++) {
	        if (al.get(i) > al.get(j)) {
	          int tmp = al.get(i);
	          al.set(i, al.get(j));
	          al.set(j, tmp);
	        }
	      }
	    }
	    System.out.println("...Sorted Arraylist...");
	    for (int i : al) {
	      System.out.println(i);
	     
	    }
	    System.out.println(al);
	  }
	}
	