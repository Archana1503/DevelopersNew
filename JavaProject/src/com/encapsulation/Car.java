package com.encapsulation;
class Gear{
	String type;
	
	public Gear(String type) {
		this.type=type;
	}
	public String toString() {
		return" "+type;
	}
}
class Engine{
	String EngineType;
	
	public  Engine(String EngineType) {
		this.EngineType=EngineType;
	}
	public String toString() {
		return" "+EngineType;
	}
}

public class Car {
	int modelno;
	String cname;
	Engine eng;
	Gear g;
	
	public Car(int modelno,String cname,Engine eng,Gear g) {
		this.modelno=modelno;
		this.cname=cname;
		this.eng=eng;
		this.g=g;
	}
	public String toString() {
		return modelno+" "+cname+" "+eng+" "+g;
	}
	

	public static void main(String[] args) {
		Car BMW=new Car(1223,"BMW VX",new Engine("petrol"),new Gear("Auto"));
		System.out.println(BMW);
		

	}

}
