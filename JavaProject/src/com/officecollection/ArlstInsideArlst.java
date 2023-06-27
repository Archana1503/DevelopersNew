package com.officecollection;

import java.util.ArrayList;
import java.util.Scanner;

class Employee100
{
	int eid;
	String ename;
	int salary;
	public Employee100(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee100 [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}
	class Department
	{
		int did;
		String dname;
		
		ArrayList<Employee100>list;
		
		public Department(int did,String dname,ArrayList<Employee100>list)
		{
			this.did=did;
			this.dname=dname;
			this.list=list;
			
		}

		@Override
		public String toString() {
			return "Department [did=" + did + ", dname=" + dname + ", list=" + list + "]";
		}
		
		
	}



public class ArlstInsideArlst {

	public static void main(String[] args) {
		ArrayList<Department>list=new ArrayList<Department>();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter the did");
			int did=sc.nextInt();
			System.out.println("Enter the dname");
			String dname=sc.next();
			
			ArrayList<Employee100>el=new ArrayList();
			System.out.println("Enter the no of Employee");
			int n=sc.nextInt();
			
			for(int j=1;j<=n;j++)
			{
				System.out.println("Enter the eid");
				int eid=sc.nextInt();
				
				System.out.println("Enter ename");
				String ename=sc.next();
				
				System.out.println("Enter the salary");
				int sal=sc.nextInt();
				
				el.add(new Employee100(eid,ename,sal));
				
			}
			list.add(new Department(did, dname, el));
				
}
		System.out.println("..........");
		for(Department d:list) {
			System.out.println(d.did+""+d.dname+" ");
			
			for(Employee100 e:d.list) {
				
			
			System.out.println(e);
		}
		System.out.println();
		}
	}
}

/* output
1
Enter the dname
Hr
Enter the no of Employee
2
Enter the eid
11
Enter ename
Arnav
Enter the salary
3000
Enter the eid
12
Enter ename
Roshani
Enter the salary
30000
Enter the did
2
Enter the dname
Sales
Enter the no of Employee
3
Enter the eid
21
Enter ename
Rosani
Enter the salary
799909
Enter the eid
22
Enter ename
sneha
Enter the salary
9000
Enter the eid
21
Enter ename
sonal
Enter the salary
7000
..........
1Hr 
Employee100 [eid=11, ename=Arnav, salary=3000]
Employee100 [eid=12, ename=Roshani, salary=30000]

2Sales 
Employee100 [eid=21, ename=Rosani, salary=799909]
Employee100 [eid=22, ename=sneha, salary=9000]
Employee100 [eid=21, ename=sonal, salary=7000]

	*/
	
			
			
	



		
		
		
		

	


