package com.encapsulation; 
//write a code to write getter and setter for student class .student class has student id,student name,Address,
// percentage in double and boolean type of is placed or not.

public class Student {
	private int studid;
	private String studname;
	private String studaddress;
	private float studper;
	
	public void setStudId(int studid) {
		this.studid= studid;
	}
	public void setStudName(String studname)
	{
		this.studname=studname;
	}
	public void setStudAddress(String studaddress) {
		this.studaddress=studaddress;
	}
	public void setStudPer(float studper) {
		if( studper>=60)
		{
		this.studper=studper;
		}
		else {
			System.out.println("Minimum 60% required");
		}
		
	}
	 public int getStudId() {
		 return studid;
	 }
	 public String getStudName() {
		 return studname;
	 }
	 public String getStudAddress() {
		 return studaddress ;
	 }
	 public float getStudPer() {
		 return studper ;
	 }
	 //is placed or not remaining




	 public static void main(String[] args) {
	
		

	}

}

	 