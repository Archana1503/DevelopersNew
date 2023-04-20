package com.first;
import java.util.Scanner;

public class FindPower {

	public static void main(String[] args) {
	int b, e;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the base: ");  
		b = sc.nextInt();  		System.out.print("Enter the exponent: ");  
	e = sc.nextInt();  
  
		double power = Math.pow(b, e);  
		//prints result  
		System.out.println(b +" to the power " +e + " is: "+power);  
		}  
		}  
	
		