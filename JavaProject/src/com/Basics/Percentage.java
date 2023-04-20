package com.Basics;
import java.util.*;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int Marathi, Hindi,English,History,Mathematics,M ;
		int M,H,E,S,G;
		int Total;
		float P;
		
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter marks of marathi=");
		 M = sc.nextInt();
		 System.out.println("Enter marks of Hind=");
		 H = sc.nextInt();
		 System.out.println("Enter marks of English=");
		 E = sc.nextInt();
		 System.out.println("Enter marks of Science=");
		 S= sc.nextInt();
		 System.out.println("Enter marks of Geography=");
		 G = sc.nextInt();
		 Total=(M+H+S+E+G);
		 System.out.println("total of all subject is ="+Total);
		 P=(Total/5);
		 System.out.println("percentage of five subject is="+P);
		
		 
	
	
		

	}

}
