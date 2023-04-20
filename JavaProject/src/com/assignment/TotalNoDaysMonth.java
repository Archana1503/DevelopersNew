package com.assignment;

import java.util.Scanner;

public class TotalNoDaysMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        int month, year;
        
        System.out.println("Enter value of year");
        Scanner sc=new Scanner(System.in);
        		year =sc.nextInt();
        		System.out.println("Enter value of month");
        		month =sc.nextInt();
        //year = 2023;
        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("Number of days is 29");

        else if(month==2)
            System.out.println("Number of days is 28");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days is 30");

        else
            System.out.println("Number of days is 31");


    }

}