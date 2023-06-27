package com.labassignmentcolle;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Emp
{
	int salary;
	String name;
	
	public Emp(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	
	
}

public class MaxSalaryChk {

	public static void main(String[] args) {
		ArrayList<Emp>al=new ArrayList<Emp>();
		al.add(new Emp(10000,"Rohan"));
		al.add(new Emp(50000,"Saurabh"));
		al.add(new Emp(40000,"neha"));
		al.add(new Emp(20000,"sonal"));
		al.add(new Emp(70000,"Rohit"));
		
		Iterator<Emp>i=al.iterator();
		int maxsalary=0;
		int sal=0;
		while(i.hasNext()) {
			Emp e=i.next();
			sal=e.salary;
			if(sal>maxsalary) {
				maxsalary=sal;
			}
		}
		System.out.println("Maximum salary.."+maxsalary);
	}

					
		
		
	

	}


