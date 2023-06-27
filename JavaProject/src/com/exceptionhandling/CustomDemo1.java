package com.exceptionhandling;

public class CustomDemo1 {
	
	public  void checkLength(String s)throws IncorrectLenthException  {
		
			if(s.length() < 8) {
				throw new IncorrectLenthException("incorrect length");
				
			}else
			{
				System.out.println("Valid range");
				
		}
		
	}

	public static void main(String[] args) {
		CustomDemo1 c=new CustomDemo1();
		try {
			c.checkLength("Archa");
		
		}catch(IncorrectLenthException e) {
			System.out.println(e.getMessage());
		}
System.out.println("helllooo");
	}

}
