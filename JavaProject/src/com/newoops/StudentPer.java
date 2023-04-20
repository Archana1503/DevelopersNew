package com.newoops;//15.create student class asign marks and calculate the percentage and print the result 1st class 2nd class 



public class StudentPer {
	int sid;
	String sname;
	int smark1;
	int smark2;
	int smark3;
	int smark4;
	float per;
	
	public void Assign(int sid,String sname,int smark1,int smark2,int smark3,int smark4 )
	{
		int sid=id;
		String sname=name;
		int smark1=mark1;
		int smark2=mark2;
		int smark3=mark3;
		
		
		public void display()
		{
			System.out.println(sid+" "+sname+" "+smark1+" "+smark2+" "+smark3+" "smark4+" "+per+" ");
		}
		
		
	}
	public void calculatepar() {
		per=(smark1+smark2+smark3+smark4)/4;
		if(per>60)
		{
			System.out.println("Student is with first class");
		}
		else 
		{
			System.out.println("Student is with second  class");
			
		}
	}
	
	
	

	public static void main(String[] args) {
		
		StudentPer s=new StudentPer();
		s.Assign(10,"Ravi",40,60,50,80);
		s.calculateper(); 
		s.display());
		
		
		
		StudentPer s2=new StudentPer();
		s2.Assign(20,"sneha",45,67,32,90);
		s2.calculateper(); 
		s2.display();
		
		

	}

}




