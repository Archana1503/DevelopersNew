package com.pattern;
import java.util.Scanner;

public class DownwordRightNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//row=4 print
		 
        System.out.println("Number of rows you want in this pattern?");
 
        int rows = sc.nextInt();
 
        System.out.println("----Pattern is----");
 
        for (int i = 1; i <= rows; i++) 
        { 
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
 
        
    }


	}


