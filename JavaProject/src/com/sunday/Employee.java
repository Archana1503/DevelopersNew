package com.sunday;//employee has a passport Employee :id name,passport p
//passport int o-no,date issue date,int validity;
import java.util.Date;

public class Employee {
	int e_id;
	String name;
	Passport p;
	
Employee(int e_id,String name,Passport p)
{
	this.e_id=e_id;
	this.name=name;
	this.p=p;
}
public String toString()
{
	return e_id+" "+name+" "+p.p_no+" "+p.issue_date+" "+;
}

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		Passport p=new Passport(67676,new Date1(15,03,2023),5);
		Employee e=new Employee(101,"Mrs Pooja",p);
		System.out.println(e);
		
		

	}

}
