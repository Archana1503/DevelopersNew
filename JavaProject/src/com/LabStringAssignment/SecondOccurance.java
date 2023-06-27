package com.LabStringAssignment;
import java.util.Scanner;

public class SecondOccurance {

	public static void main(String[] args) {
	

	 Scanner sc = new Scanner(System.in);

    System.out.println("Enter String: ");
    String str = sc.nextLine();
    System.out.println("Enter a character: ");
    char ch = sc.next().charAt(0);

    int index = str.indexOf(ch, str.indexOf(ch) + 1);

    System.out.println("Index of the second occurrence of " 
                       + " character \'" + ch + "\' is: "+ index);
    sc.close();
 }
}

