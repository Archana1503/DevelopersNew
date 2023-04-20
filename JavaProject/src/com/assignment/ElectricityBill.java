package com.assignment;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		System.out.println("Enter units conumed by coustmer");
		
		Scanner sc=new Scanner(System.in);
		int unit=sc.nextInt();
		 double bill;
		
		
		//System.out.println("Enter units conumed by coustmer");why this not work??
		
		if(unit<50)
		{
			bill=unit*0.50;
			System.out.println("electricity bill is"+bill);
			
			
		}
		else if(unit<150)
		{
		bill=(unit-50)*0.75+50*0.50;
		System.out.println("electricity bill is"+bill);
		}
		
		
		
		 else if(unit<250)
		{
		bill=50*0.50+100*0.75+(250-unit)*1.20;
		System.out.println("electricity bill is"+bill);
		}
		
		else
		{
			bill=50*0.50+100*0.75+100*1.20+(unit-250)*0.2;
			System.out.println("electricity bill is"+bill);
			
		}
		
		
		

	}

}
