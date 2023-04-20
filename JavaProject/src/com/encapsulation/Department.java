package com.encapsulation;

class Employee {
	int eid;
	String ename;

public Employee(int eid,String ename)//parameterizes constructor
{
	this.eid=eid;
	this.ename=ename;
}

public String toString()
{
	return eid+" "+ename;
}
}

public class Department {
	int did;
	String dname;
	Employee emp;
	
	public Department(int did,String dname,Employee emp) {
		this.did=did;
		this.dname=dname;
		this.emp=emp;
		
		
	}
	public String toString() {
		return did +" "+dname+" "+emp;
		}
	
	

	public static void main(String[] args) {
		Department dept=new Department(1,"HR", new Employee(10,"Amit"));//new employee is anonymus object
		System.out.println(dept);
	

	}

}
