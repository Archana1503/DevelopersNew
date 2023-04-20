package com.abstractinterface;

public interface Movable {
	void draw();
	
	}
class Chair implements Movable
{
	public void draw() {
		System.out.println("chair moving");
	}
	public void print() {
		System.out.println("print chair picture");
	}
}
class Table implements  Movable{
	public void draw() {
		System.out.println("table moving");
	}
	
}