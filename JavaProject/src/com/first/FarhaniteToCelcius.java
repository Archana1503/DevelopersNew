package com.first;
import java.util.Scanner;

public class FarhaniteToCelcius {

	public static void main(String[] args) {
		System.out.println("Enter value of tempreture in farhenite");
		Scanner sc=new Scanner(System.in);
		int Fahrenheit=sc.nextInt();
		int Celsius  = ((Fahrenheit-32)*5)/9;  
         System.out.println("Temperature in celsius is: "+Celsius);  
		
		
		// TODO Auto-generated method stub

	}

}
