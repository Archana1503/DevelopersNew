package com.conditions;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		
		 char operator;
		    Double number1, number2, result;

		    // create an object of Scanner class
		    Scanner input = new Scanner(System.in);

		    // ask users to enter operator
		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = input.next().charAt(0);

		    // ask users to enter numbers
		    System.out.println("Enter first number");
		    number1 = input.nextDouble();

		    System.out.println("Enter second number");
		    number2 = input.nextDouble();

		    switch (operator) {

		      // performs addition between numbers
		      case '+':
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;

		      // performs subtraction between numbers
		      case '-':
		        result = number1 - number2;
		        System.out.println(number1 + " - " + number2 + " = " + result);
		        break;

		      // performs multiplication between numbers
		      case '*':
		        result = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result);
		        break;

		      // performs division between numbers
		      case '/':
		        result = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    input.close();
		  }
		}

	
//		
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter number1");
//System.out.println("Enter number");
//int num,num1,num2;
//num=sc.nextInt();
//num1=sc.nextInt();
//num2=sc.nextInt();
//System.out.println("Enter choice");
//System.out.println("Menu ");
//System.out.println("1.Addition");
//System.out.println("2.Substraction");
//System.out.println("3.Division");
//System.out.println("4.multiplication");
//
//switch(num)
//{
//case 1:
//	int add= num1+num2;
//	System.out.println("sum is"+add);
//	break;
//case 2:
//	int sub= num1+num2;
//	System.out.println("sum is"+sub);
//	break;
//case 3:
//	int div= num1+num2;
//	System.out.println("sum is"+div);
//	break;
//case 4:
//	int mul= num1+num2;
//	System.out.println("sum is"+mul);
//	break;
//	
//	
//	
//
//}
//	}


