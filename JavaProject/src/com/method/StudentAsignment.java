package com.method;
//create class student and write meanigful program with  methos 1 with return type calculate percentage



//1 without return type
//displat student data 1 with parameter list

public class StudentAsignment {
	int sid;
	double per;
	
	String sname;
	int smark1;
	int smark2;
	int smark3;
	public void acceptDetails(int id,String name,int mark1,int mark2,int mark3)
	{
		sid=id;
		sname=name;
		smark1=mark1;
		smark2=mark2;
		smark3=mark3;
		
		
	}
	public double perCalculate() {
	
		double per=(smark1+smark2+smark3)/3;
		return per;
		
		
	}
	
	public void displayData(int id,String name,int mark1,int mark2,int mark3) {
		
		System.out.println(sid+" "+sname+" "+smark1+" "+smark2+" "+smark3+" "+per);
	}
	
	

	public static void main(String[] args) {
		
		StudentAsignment a =new StudentAsignment();
		a.acceptDetails(10,"Ananya",80,90,85);
		//double ans=per.perCalculate();
		//System.out.println(+ans);
		a.perCalculate();
		a.displayData(20, "yash", 70, 35, 45);
//		
//		StudentAssignment s2=new StudentAssignment();
//		s2.acceptDetails(20, "yash", 70, 35, 45);
//		s2.perCalculate();
//		s2.display();

	}

}
