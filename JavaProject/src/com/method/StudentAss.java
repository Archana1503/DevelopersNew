package com.method;
//1.add method display data inside class change values of id name in that method 
//and also print the changed value in same method.call displayData method from main method and see 
//the output.Observe displayData can only be called by creating object of Student.

public class StudentAss {
	int sid;
	String sname;
	public void displayData(int id,String name) {
		
		int sid=id;
		String sname=name;
		System.out.println(+id+" "+name);
	}

	public static void main(String[] args) {
	StudentAss s=new StudentAss();
	s.displayData(20,"pravin");
	System.out.println();
	
	

	}

}
//Answer display data can be called by creating object of student