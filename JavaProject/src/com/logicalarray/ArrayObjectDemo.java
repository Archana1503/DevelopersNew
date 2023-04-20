package com.logicalarray;
import java.util.Scanner;

import java.util.Arrays;


	class Stud{
		int id;
		String name;
		int marks[];
		
		Stud(int id,String name,int[]marks){
			this.id=id;
			this.name=name;
			this.marks=marks;
		}
		public String toString() {
			return id+" "+" "+Arrays.toString(marks);
			
		}
	}
	public class ArrayObjectDemo {

	public static void main(String[] args) {
		Stud[]s=new Stud[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
			System.out.println("enter the id");
			int sid=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the marks");
			int mk[]=new int[3];
			for(int j=0;j<mk.length;j++) {
				mk[j]=sc.nextInt();
			}
			s[i]=new Stud(sid,name,mk);
		}
		System.out.println("......");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			}
			
		}
		
	}


