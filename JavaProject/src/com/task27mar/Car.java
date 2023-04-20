package com.task27mar;

public class Car {
	String modelNo;
	String name;
	 String color;
	int prize;
//	
//	public void Display() {
//		System.out.println(c1.modelNo+" "+c1.name+" "+c1.color+" "+c1.prize);
//		
//		
//		
//	}
	
	

	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.modelNo+" "+c1.name+" "+c1.color+" "+c1.prize);
		
		
		
		
		
		c1.modelNo="dfghgd";
		
		c1.name="Brezza";
		c1.color="red";
		c1.prize=12000000;
		
		
		
		Car c2=new Car();

		
		c2.modelNo="ytttfd";
		
		c2.name="Artiga";
		c2.color="grey";
		c2.prize=15000000;
		System.out.println(c2.modelNo+" "+c2.name+" "+c2.color+" "+c2.prize);
		
		
		Car c3=new Car();

		c2.modelNo="ffggtfd";
		
		c2.name="Xuv";
		c2.color="white";
		c2.prize=25000000;
		System.out.println(c3.modelNo+" "+c3.name+" "+c3.color+" "+c3.prize);
		System.out.println(c1+" "+c2 +" "+c3 );
		
	
		
		
		
		
		
		
		

	}

}
