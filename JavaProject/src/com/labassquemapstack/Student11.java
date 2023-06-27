package com.labassquemapstack;
//2	Consider a Set which contains Student {id, name, marks} objects. 
//WAP to create a Listfrom this set such that Student objects are sorted by marks in descending order. 

import java.util.*;


public class Student11 {
	 public static void main(String[] args) {
		    class Student {
		             private int id;
		             private String name;
		             private int marks;

		             public Student(int id, String name, int marks) {
		                 this.id = id;
		                 this.name = name;
		                 this.marks = marks;
		             }

		             public int getId() {
		                 return id;
		             }

		             public String getName() {
		                 return name;
		             }

		             public int getMarks() {
		                 return marks;
		             }
		         }

		         Set<Student> studentSet = new HashSet<>();

		         Student student1 = new Student(1, "Aniket", 80);
		         Student student2 = new Student(2, "Rahul", 99);
		         Student student3 = new Student(3, "Rohit", 65);

		         studentSet.add(student1);
		         studentSet.add(student2);
		         studentSet.add(student3);

		        List<Student> studentList = new ArrayList<>(studentSet);

		     Comparator<Student> marksComparator = Comparator.comparingInt(Student::getMarks).reversed();

		        Collections.sort(studentList, marksComparator);

		         
		    for (Student student : studentList) {
		     System.out.println(student.getId() + " " + student.getName() + " " + student.getMarks());
		         }
		     }
		 }
	