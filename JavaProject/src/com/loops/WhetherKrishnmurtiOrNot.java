package com.loops;
import java.util.Scanner;

public class WhetherKrishnmurtiOrNot {

	public static void main(String[] args) {
		
		        int range;  
		          
		        
		        Scanner sc=new Scanner(System.in);  
		          
		        
		        System.out.println("Enter the value of range");  
		          
		          
		        range = sc.nextInt();  
		  
		        for(int i = 1; i <= range; i++)  
		            checknum(i);  
		    }  
		  
		      
		    static int fact(int number)   
		    {   
		        int f = 1;   
		        while (number != 0) {   
		            f = f * number;   
		            number--;   
		        }   
		       
		    }   
		  
		     
		    static void checknum(int number)   
		    {   
		        int sum = 0;    
		          
		        int tempNumber = number;   
		          
		       
		        while (tempNumber != 0) {   
		              
		            sum = sum + fact(tempNumber % 10);   
		  
		            
		          
		        }   
		  
		         
		        if(sum == number)  
		            System.out.println( " is a krishnamurthy number"+number);   

	}

}
