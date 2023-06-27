package com.exceptionhandling;

import java.io.IOException;

public class PropagatioinChecked {
	public static void method3() {
		//throw new IOException();//compile time error because checked exception canot propagate
		
	}
	public void method1() {
		method3();
	}
	public void method2() {
		try{
			method1();
		}catch(Exception e){
			System.out.println("Exception Handled");
		}

		
	}

	public static void main(String[] args) {
		
		PropagatioinChecked p=new PropagatioinChecked();
		//p.PropagatioinChecked(); same reason above
	}

}



