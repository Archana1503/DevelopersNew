package com.logicalarray;//percentage display remaining


import java.util.Arrays;
import java.util.Scanner;

class Student{
	int id;
	private String name;
	private int marks[];
	double Percentage;
	
	public Student(int id,String name,int[]marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	//public String toString() {
		//return id+" "+" "+Arrays.toString(marks);
	public int getid() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public double getPercentage() {
		int total=0;
		for(int mark:marks) {
			total+=mark;
		}
		double percentage=(double)total/marks.length;
		return percentage;
		}
		
	}
		
		public class CalculatePercentage {

	public static void main(String[] args) {
		Student[]s=new Student[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
			System.out.println("enter the id");
			int sid=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the marks");
			int mk[]=new int[5];
			for(int j=0;j<mk.length;j++) {
				mk[j]=sc.nextInt();
			}
			s[i]=new Student(sid,name,mk);
		}
		//loop to display who got more than 60%
		
		
		System.out.println("Student who got more than 60%");
		for(Student Student:s) {
			double Percentage=Student.getPercentage();
			if(Percentage>60) {
				System.out.println(Student.getid()+"."+Student.getName()+Percentage+"%");
			}
		//System.out.println("......");
		//for(int i=0;i<s.length;i++) {
			//double percentage=s.length;//error
			
				
			}
			//System.out.println(s[i]);
			}
			
		}
		
	
	

