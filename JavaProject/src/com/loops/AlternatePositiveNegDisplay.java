package com.loops;
import java.util.Scanner;
//print 2 -4 6 -8...n
//n=10 series

public class AlternatePositiveNegDisplay {
	
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		
		int num2;
		num2 = sc.nextInt();  
		
		
		
		
		
		
		
		
		for (int i = 1;i <= num2;i++)
		{
			if(i%2==1){
				
		    System.out.println(2*i+" ");
		}
	else
		{
			System.out.println(-2*i+" ");
		}
		}
	}

}



