package com.newoops;//15.create student class asign marks and calculate the percentage and print the result 1st class 2nd class 




public class Studentper {


		


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
public void perCalculate() {

	per=(smark1+smark2+smark3)/3;
	
	per=(smark1+smark2+smark3)/4;
	if(per>60)
	{
		System.out.println("Student is with first class");
	}
	else 
	{
		System.out.println("Student is with second  class");
		
	}
	
}

public void display() {
	
	System.out.println(sid+" "+sname+" "+smark1+" "+smark2+" "+smark3+" "+per);
}



public static void main(String[] args) {
	
	Studentper s =new Studentper();
	s.acceptDetails(10,"Ananya",80,90,85);
	s.perCalculate();
	s.display();
	
	Studentper s2=new Studentper();
	s2.acceptDetails(20, "yash", 70, 35, 45);
	s2.perCalculate();
	s2.display();

}

}