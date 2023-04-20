package com.encapsulation;//validation remaining

public class StudentInfo {

	public static void main(String[] args) {
      
		
		Student stud=new Student();
		
		stud.setStudId(10);
		stud.setStudName("Archana");
		stud.setStudAddress("sanjeevani nivas");
		stud.setStudPer(60);
		float per=stud.getStudPer();
		System.out.println(per);
		System.out.println(stud.getStudId());
		
		
		

	}

}
