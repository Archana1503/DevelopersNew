package com.objectarray;//create array of student .student has id,name and 
//integer type
//of array to store the marks. 
//create array and display only those student who got percentage more than 60
import java.util.Scanner;
import java.util.Scanner;
class Student{
	int stud_id;
	String stud_name;
	int stud_marks;
	
	public Student(int stud_id,String stud_name,int stud_marks) {
		this.stud_id=stud_id;
		this.stud_name=stud_name;
		this.stud_marks=stud_marks;
	}
	public String toString() {
		return stud_id+" "+stud_name+" "+stud_marks;
	}
}

public class ArrayInsideArray {

	private static int sid;

	public static void main(String[] args) {
		Student[] stud=new Student[3]; //why error
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<stud.length;i++) {
		System.out.println("Enter id of student");
		int id=sc.nextInt();
		System.out.println();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the marks");
		int mk[]=new int[3];
		for(int j=0;j<mk.length;j++) {
			mk[j]=sc.nextInt();
		}
		stud[i]=new Student(sid,name,mk);
		
		
			
		}
		
		
		
//		
//		Employee emp[]=new Employee[3];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<emp.length;i++) {
//        System.out.println("Enter the id");	
//        int id=sc.nextInt();
//        System.out.println("enter  name of employee");
//        String name=sc.next();
//        System.out.println("Enter salary of employee");
//        float salary=sc.nextInt();
//        
//       emp[i]=new Employee(id,name,salary);
//		}
			
			
			
			
		}
			
		
		

	}

}
