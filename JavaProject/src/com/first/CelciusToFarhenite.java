package com.first;
import java.util.Scanner;

public class CelciusToFarhenite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter value of tempreture in farhenite");
		Scanner sc=new Scanner(System.in);
		int celsius=sc.nextInt();
		 
		int Fahrenheit= ((celsius*9)/5)+32 ;
         System.out.println("Temperature in celsius is: "+Fahrenheit);  
		
		 
	}

}
