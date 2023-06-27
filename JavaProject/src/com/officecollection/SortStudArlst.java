package com.officecollection;

import java.util.ArrayList;
import java.util.Collections;

class Student33 implements Comparable<Student33>{
	int id;
	String name;
	int marks;
	
	public Student33(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student33 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student33 o) {
		
	
		return this.marks-o.marks;
	}
	
	
}

public class SortStudArlst {

	public static void main(String[] args) {
		ArrayList<Student33>list=new ArrayList<>() ;
		list.add(new Student33(1,"Arav",77));
		list.add(new Student33(2,"rahul",80));
		list.add(new Student33(3,"sneha",91));
		list.add(new Student33(4,"sneha",60));
		
		for(Student33 s:list) {
			System.out.println(s);
			
		}
		System.out.println("...........");
		Collections.sort(list);
		for(Student33 s:list) {
			System.out.println(s);
		}
		
		

	}

}
