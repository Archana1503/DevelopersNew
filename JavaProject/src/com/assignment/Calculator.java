package com.assignment;
import java.util.Scanner;

public class Calculator {

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value of 1st number ::");
      int a = sc.nextInt();

      System.out.println("Enter value of 2nd number ::");
      int b = sc.nextInt();

      System.out.println("Select operation");
      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
      char ch = sc.next().charAt(0);
      switch(ch) {
         case 'a' :
         System.out.println("Sum of the given two numbers: "+(a+b));
         break;
         case 's' :
         System.out.println("Difference between the two numbers: "+(a-b));
         break;
         case 'm' :
         System.out.println("Product of the two numbers: "+(a*b));
         case 'd' :
         System.out.println("Result of the division: "+(a/b));
         break;
         default :
         System.out.println("Invalid input");
      }
   }
}



//

//package com.assignment;
//import java.util.Scanner;
//
//public class Calculator {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//Scanner sc=new Scanner(System.in);
//int num,num1,num2;
//num=sc.nextInt();
//num1=sc.nextInt();
//num2=sc.nextInt();
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
//case 4:int mul= num1+num2;
	//System.out.println("sum is"+mul);
	//break;
	
	
	

//}
	//}

//}
