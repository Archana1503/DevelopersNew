package com.task27mar;

import java.util.Scanner;

public class PalidromOrnot {

	public static void main(String[] args) {
		int r,sum=0,temp;    
        System.out.println("Enter a number ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();//int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		

	}

