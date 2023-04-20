package com.OOps;//



public class Employee {
	int id;
	String name;
	public void display() {
		
		System.out.println("my id is"+id);
		System.out.println("and my name is"+name);
	}

	



	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.id=10;
		e1.name="Archana";
		System.out.println(e1.id);
		System.out.println(e1.name);
		
		
	}
		

	}


