package com.sunday;//output didnt understand
import java.util.Scanner;

abstract class Father
{
	String name;
	int min;
	int marks;
	
	void marks(String name,int min,int marks) {
		this.name=name;
		this.min=min;
		this.marks=marks;
		}
	abstract void marksObtain();
}
class Student extends Father{
		@Override
		void marksObtain() {
			if(marks>=min) {
				System.out.println("i will provide you laptop");
			}else {
				System.out.println("your score is less than 90%....you will not get laptop...");
			}
				
			}
		}
	

public class AbstractMarks {

	public static void main(String[] args) {
		
		Student s=new Student();//marks obtain
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name");
		s.name=sc.next();
		
		System.out.println("Enter minimun marks you want");
		s.min =sc.nextInt();
		
		System.out.println("enter the marks obtained by student");
		s.marksObtain();
		
		

	}

}




//void display() {
//	System.out.println("laptop company"+l_name+"price is"+price);
//}
// Father()
//{
//	System.out.println("lenovo laptop");
//}
// Father(int price)
// {
//	 this();
//	 this.laptop=laptop;
// }
// public abstract void frontCamera();
//
//}
//abstract class LaptopWithFrontCmera extend Father
//{
//LaptopWithFrontCamer
//}


