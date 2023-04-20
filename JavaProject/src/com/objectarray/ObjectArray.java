package com.objectarray;//create array of employee .
//employee has id,name,salary;and display
//also display if salary is greter than 25000
import java.util.Scanner;


class Employee
{
int id;
String name;
float salary;
	
public Employee(int id,String name,float salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	
}
public String toString() {
	return id+" "+name+" "+salary;
}
}
public class ObjectArray {

	public static void main(String[] args) {
		
		Employee emp[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++) {
        System.out.println("Enter the id");	
        int id=sc.nextInt();
        System.out.println("enter  name of employee");
        String name=sc.next();
        System.out.println("Enter salary of employee");
        float salary=sc.nextInt();
        
       emp[i]=new Employee(id,name,salary);
		}
		//emp[i]=new Employee(id,name,salary)
	
		
//		hard code value
//	   emp[0]=new Employee(10,"Archana",30000);
//		emp[1]=new Employee(20,"Aniket",300000);
//		emp[2]=new Employee(30,"Anvi",20000);
		System.out.println("........");
		for(int i=0;i<emp.length;i++) {
			if(emp[i].salary>25000) {
		System.out.println(emp[i]);

	}

}
}
}