package com.conditions;
import java.util.Scanner;


public class GreterNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter the number1");
		
		 num1= sc.nextInt();
		 System.out.println("Enter the number2");
			
		 num2 = sc.nextInt();
		 System.out.println("Enter the number3");
			
		 num3 = sc.nextInt();
		if((num1>=num2)&&(num1>=num3)) {
			System.out.println("num1 is greter than num2and num3");
		}
		else if	((num2>=num1)&&(num2>=num3))
		{
			
			System.out.println("num2 is greter than num1and num3");
		}
		else {
			System.out.println("num3 is greter than num1and num2");
		}

	}

}
