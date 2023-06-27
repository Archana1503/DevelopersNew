package com.exceptionhandling;//why not showing output 

public class UseofStackTrace {
	class Program {
	    public static void foo() {
	      try {
	        int num1 = 5/0;
	      }
	      catch (Throwable e) {
	          e.printStackTrace();
	      }
	    }

	    
	 

	public static void main(String[] args) {
		UseofStackTrace u=new UseofStackTrace();
	     foo();
		    }
		}
	}
		

	
