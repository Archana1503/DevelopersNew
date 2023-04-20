package com.encapsulation;//write code to overload static method

public class StaticOverload {

	
		public static void display()   
		{   
		System.out.println("Static method called.");   
		}   
		//overloaded static method  
		public static void display(int x)   
		{   
		System.out.println("An overloaded static method called.");   
		}   
		  
		public static void main(String args[])   
		{   
		//calling static method by using the class name  
			StaticOverload.display();   
			StaticOverload.display(160);   
		}   
		}  
		

	
