package com.sunday;
import java.util.Scanner;

public class Movie {
	int age;
	String name;
	String  movieName;
	float price;
	float discount;
	
	

	void priceCalculate()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your age");
		age = sc.nextInt();
		System.out.println("Enter movie name ");
		movieName=sc.next();
		System.out.println("Do you have any coupon code 1 for yes and 0 for no");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
		System.out.println("enter your coupon code");
		int code=sc.nextInt();

		
			if(code==100) {
				 discount=400*0.15f;
				//int discount=(400*(15/100));
				price=400-discount;
				System.out.println("prize of movie is"+price);
				
				
				
			}
			else {
				discount=400*0.20f;
				price=400-discount;
				System.out.println("prize of movie is"+price);
				
				
			}
		}
		
				
		else
			System.out.println("you dont have any discount");
		{
			
	
		}
	}
	void display()
	{
		System.out.println(" total discount="+discount+"  "+"your total move price"+price);
	}
	
	
		
		
		
	
	

	public static void main(String[] args) {
		
		Movie m=new Movie();
		m.priceCalculate();
		m.display();
		
		
		

	}

}

