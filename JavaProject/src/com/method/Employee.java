package com.method;

public class Employee {
	int eid;
	String ename;
	int esalary;
	int pf;
	 public void acceptdetails(int id,String name,int salary ) {
		 eid=id;
		 ename=name;
		 esalary=salary;
	 }
		 
public void pfCalculate() {
				
				pf=((esalary*12)/100);
 }
		
public void displayDetail()
	 {
 System.out.println(+eid+" "+ename+" "+esalary+" "+pf+" ");
	 
		 }
 public static void main(String[] args) {
		Employee e=new Employee();
		e.acceptdetails(10,"Aniket",200000);
		
		e.pfCalculate();
		
		
		e.displayDetail();
		
	}

}
