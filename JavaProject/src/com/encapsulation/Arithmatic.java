package com.encapsulation;//write code to overload calculate method to perform the arithmatic operation

public class Arithmatic {

	
	    int sub(int num1, int num2)
	    {
	        return num1-num2;
	    }
	    int add(int num1, int num2, int num3)
	    {
	        return num1+num2+num3;
	    }
	    int mul(int num1, int num2, int num3, int num4)
	    {
	        return num1*num2*num3*num4;
	    }
	    
	    
	    public static void main(String[] args) 
	    {    
	    	Arithmatic a = new Arithmatic();
	    	//This will call the first add method
	        System.out.println("Substraction of two numbers: "+a.sub(10, 20));
	        //This will call second add method
	        System.out.println("Sum of three numbers: "+a.add(10, 20, 30));
	        //This will call third add method
	        System.out.println("multiplication  of four numbers: "+a.mul(1,  2, 3, 4));
	        
	    }
	    
	}