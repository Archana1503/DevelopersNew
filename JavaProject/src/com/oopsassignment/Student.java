package com.oopsassignment;//create class object by using new keyword

public class Student {
	int id;
	String name;
	double marks;

	public static void main(String[] args) {
		
	Student stud=new Student();
	System.out.println(stud.id+" "+stud.name+" "+stud.marks);//initial value
	stud.id=10;
	stud.name="Archana";
	stud.marks=80.70;
	System.out.println(stud.id+" "+stud.name+" "+stud.marks);
	System.out.println("............................................................");

	Student stud2=new Student();
	System.out.println(stud2.id+" "+stud2.name+" "+stud2.marks+" ");//initial value
	stud2.name="Aniket";
	stud2.id=20;
	stud2.marks=90;
	System.out.println(stud2.id+" "+stud2.name+" "+stud2.marks);
	System.out.println(stud + "   " + stud2);
	
	

	}

}

