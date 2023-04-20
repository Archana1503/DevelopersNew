package com.loops;
import java.util.Scanner;

public class FrequencyOfDigitInNo {

	public static void main(String[] args) {

		
		
		
		Scanner sc = new Scanner(System.in);
        int num,temp,dig,digit,count=0;
        System.out.println("Enter Number");
        num = sc.nextInt();
        temp=num;
        System.out.println("Enter Digit whose frequency is required");
        digit = sc.nextInt();
        while(temp>0)
        {
            dig = temp%10;
            if(dig==digit)
            {
                count++;
            }
            temp=temp/10;
        }
        System.out.println("Original Number : "+num);
        System.out.println("Frequency of "+digit+" is : "+count);
    }
}

/* 
 
 
import java.io.*;
import java.util.*;
class Digit
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,p,dig,i;
        int digit[] = new int[10];
        System.out.println("Enter Number");
        n = in.nextInt();
        p=n;
        while(p>0)
        {
            dig = p%10;
            for(i=0;i<=9;i++)
            {
                if(dig==i)
                {
                    digit[i]++;
                }
            }
            p=p/10;
        }
        System.out.println("Original Number : "+n);
        for(i=0;i<=9;i++)
        {
            if(digit[i]!=0)
            {
                System.out.println("Frequency of "+i+" is : "+digit[i]);
            }
        }
    }// end of main method
}
 */