package com.loops;
import java.util.Scanner;

public class SumAllodd {
	
	public static void main(String[] args) {
		
		int n, sum = 0;
        
        System.out.println("Enter a number");
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        //Sum of all even numbers between 1 to n
        
        for(int i = 0; i <= n; i++) {
            
            /*If number is divisible by 2, 
             *then it's a even number
             */       
            if(i % 2 == 1) {
            	sum = sum + i;
                
                
            }
            
            
        }
        System.out.println("sum of odd number is"+sum);

		
		
		
		
	}
		
}
	
	

