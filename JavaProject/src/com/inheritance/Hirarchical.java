package com.inheritance;
class Vehical{
	int wheels=3;
}
class Car extends Vehical{
	void showCar() {
		wheels=4;
		System.out.println(wheels);
	}
}
class  Truck extends Vehical{
	void showTruck() {
		wheels=8;
		System.out.println(wheels);
		
	}
}
public class Hirarchical {
	

	public static void main(String[] args) {
		Car c=new Car();
		c.showCar();
		Truck t=new Truck();
		t.showTruck();
		
		

	}

}
