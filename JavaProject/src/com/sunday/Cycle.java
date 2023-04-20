package com.sunday;

public class Cycle {
	String brand_name;
	String color;
	int no_Ofwheels;
	

	Cycle(){
		this("Atlas","Black",5);
		System.out.println("I am a default constructor");
	}
	public Cycle(int price,int speed) {
		this();
		System.out.println("price of cycle"+price);
		System.out.println("speed of cycle"+speed);
	}
	public Cycle(String brand_name,String color,int no_Ofwheels) {
		this.brand_name=brand_name;
		
		 this.color=color;
		 this.no_Ofwheels=no_Ofwheels;
		
	}
	public void display() {
		System.out.println("Brand name="+brand_name,"color="+color+"wheels="+no_Ofwheels);
	}

	
	public static void main(String[] args) {
		Cycle c=new Cycle(7000,100);
		c.display();
				
		

	}

}
