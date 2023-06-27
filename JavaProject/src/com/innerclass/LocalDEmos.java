package com.innerclass;



class MyOuterClass{
	int x=30;
	public void Display() {
		class MylocalInnerClass{
			public void put() {
				System.out.println("this is local");
			}
		}
		MylocalInnerClass c=new MylocalInnerClass();
		c.put();
		
		
	}
}

public class LocalDEmos {

	public static void main(String[] args) {
		MyOuterClass m= new MyOuterClass(); 
			m.Display();
		}

	
}
