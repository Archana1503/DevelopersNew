package com.loops;
import java.util.Scanner;

public class primeNoBtn {

	public static void main(String[] args) {
		

        System.out.println("Enter a number ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
primeCal(n);//why this
}
static void primeCal(int num)
{
int count=0;
for(int i=400;i>=300;i--)
{
if(num%i==0)
{
     count++;	        
}
}
if(count==2)
{
    System.out.println("prime number ");
}
else
{
System.out.println("Not a prime number ");        
} 
}
	
	}
