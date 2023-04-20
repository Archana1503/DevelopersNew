package com.writtenassign;
import java.util.Scanner;

public class Trimorphic {

	public static void main(String[] args) {
		
        //int n = 4;
      System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

        int cube = n*n*n;

        while(n!=0)
        {
            if(n%10!=cube%10)
            {
                System.out.println("Not a Trimorphic number");
                break;
            }

            n = n/10;

            cube = cube/10;
        }

        if(n==0)
        {
            System.out.println("Trimorphic number");
        }
    }
}