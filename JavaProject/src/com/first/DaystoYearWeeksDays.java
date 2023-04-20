package com.first;
import java.util.Scanner;

public class DaystoYearWeeksDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of days ");
		int days =sc.nextInt();
		int years=days/365;
		System.out.println("No of years are" +years);
		int weeks=(days%365)/7;
		System.out.println("No of Weeks are" +weeks);
		int day=(weeks%365)%7;
		System.out.println("No of day are" +day);
		
		//int weeks=(days-(days*365))/7;
		//int days=days -((years*365)+weeks*365);
		
		
		
	
		
		
		
		// TODO Auto-generated method stub

	}

}
