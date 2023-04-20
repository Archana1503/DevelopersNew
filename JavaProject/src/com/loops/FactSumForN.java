package com.loops;
import java.util.Scanner;

public class FactSumForN {

	public static void main(String[] args) 
	 {
		 
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number");
		        
		        {
		            Scanner in = new Scanner(System.in);
		            int i; 
		            int n; 
		            int f=1; 
		            int s=0; 
		            System.out.println("Enter the value of N : ");
		           
		            for(i=1; i<=n; i++)
		            {
		                f=f*i;
		                s=s+f;
		            }
		            System.out.println("Sum of the factorial numbers is "+s);
		        }
		    }
	 }
