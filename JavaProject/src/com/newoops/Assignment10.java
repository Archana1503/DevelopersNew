package com.newoops;
//add id name in student class,assign value to id name there itself and in main method print value.then change value of instance variable and
//print value.observe you canot acces id directly without creating object.also 2 object have 2 seprate set of data

public class Assignment10 {
	int id=10;
	String name="Aniket";
	
	

	public static void main(String[] args) {
		//you canot access id directly without creating object
		//System.out.println(id);
		//System.out.println(name);
		 Assignment10 s1=new Assignment10();
		 System.out.println(s1.id);

		 System.out.println(s1.name);
		 s1.id=20;
		 s1.name="Archana";
		 System.out.println(s1.id);
		 System.out.println(s1.name);
		 
	}

}
