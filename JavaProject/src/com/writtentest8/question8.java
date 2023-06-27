package com.writtentest8;
//8.	Rewrite the following program segment using Ternary statement. 	
//if(sale > 15000)
 //comm = sale * 5 / 100;
 //else comm=0.0;

  



public class question8 {
	public static void main(String[] args) 
	{  
         double sale = 20000;
		        double comm = (sale > 15000) ? (sale * 5 / 100) : 0.0;
		        System.out.println("Commission: " + comm);
		    }
		}

//output Commission: 1000.0 
