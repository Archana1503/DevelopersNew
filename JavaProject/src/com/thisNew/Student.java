package com.thisNew;

public class Student {
	int rollno;
	String name;
	float per;
	
	
public void input(int rollno)
{
	this.rollno=rollno;
	
}
public void display()
{
	System.out.println(rollno);
	
}
	public static void main(String[] args) {
		
		Student s =new Student ();
		s.input(15);
		s.display();
		
		
		
		
		

	}

}
