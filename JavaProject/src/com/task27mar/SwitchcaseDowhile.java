package com.task27mar;

import java.util.Scanner;

public class SwitchcaseDowhile {

public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter number of day");
		int DayNum =sc.nextInt();
		char ch;
		do {
		
		switch(DayNum)
		{
		case 1:
			System.out.println("Sunday...its a holiday");
			break;
			
		case 2:
			System.out.println("Monday...first working day");
		break;
		
		case 3:
			System.out.println("tuesday..middle of week");
			break;
		case 4:
			System.out.println("Wednesday...tired");
			break;
		case 5:
			System.out.println("Thurday...Waiting for weekend");
			break;
		case 6:
			System.out.println("its friday....yahooooo");
			break;
		case 7:
			System.out.println("Saturday.....Finally");
			break;
			default:
				System.out.println("invalid Day number");
		}
		System.out.println("DO you Want TO continue...");
		ch =sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
				
				
		}
		
		
		
		






	}


