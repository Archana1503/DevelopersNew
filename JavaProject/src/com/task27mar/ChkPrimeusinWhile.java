package com.task27mar;
import java.util.Scanner;

public class ChkPrimeusinWhile {

	public static void main(String[] args) {
	

Scanner sc=new Scanner("System.in");
System.out.println("enter value of number");
int num=sc.nextInt();



int n = 2;

while (n <= num / 2) {
 if (num % n == 0) {
  
  break;
 }
 n++;
}
if (divisibleCount == 0 ) {
 System.out.print(num + " is a prime number ");
} else {
 System.out.print( + " is not a prime number ");
}

}
}