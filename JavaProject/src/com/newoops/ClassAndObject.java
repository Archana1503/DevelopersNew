package com.newoops;

public class ClassAndObject {//class and object  initialize through referce through reference
	
	int id;
	String name;
//	class ClassAndObject{
	
	void acceptDetails() {
		id=10;
		name="Anu";
	}
//		id=10;
//		
		
	

	public static void main(String[] args) {
		ClassAndObject c1=new ClassAndObject();
		c1.id=101;
		c1.name="Anu";
		System.out.println(c1.id+" "+c1.name);
		
		
		

	}

}

