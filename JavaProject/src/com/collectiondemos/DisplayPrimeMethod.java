package com.collectiondemos;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayPrimeMethod {
	
 public static void displayPrime(ArrayList<Integer>al) {
		
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

	public static void main(String[] args) {
		DisplayPrimeMethod d=new DisplayPrimeMethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		
		
		d.displayPrime(al);
		
		
	}

}
