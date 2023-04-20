package com.inheritance;
class mobile{
	
	

String memorySize="10GB";

}
class Apple extends mobile{
	String camera="13px";
	}
class Iphone extends Apple{
	String name="iPhone14pro";
	
	public void showDetails() {
		System.out.println(memorySize+" "+camera+" "+name);
	}
}


public class MultilevelDemo {

	public static void main(String[] args) {
		Iphone p=new Iphone();
		p.showDetails();
		
		

	}

}
