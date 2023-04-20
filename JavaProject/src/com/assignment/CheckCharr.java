package com.assignment;
import java.util.Scanner;

public class CheckCharr {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

	
	
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter any caracter : ");
    char ch = sc.next().charAt(0);

    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

         System.out.println(ch + " is A ALPHABET.");

    } else if(ch >= '0' && ch <= '9') {

         System.out.println(ch + " is A DIGIT.");

    } else {

         System.out.println(ch + " is A SPECIAL CHARACTER.");
    }

}
}