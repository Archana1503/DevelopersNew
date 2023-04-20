package com.twoDarray;
import java.util.Scanner;

public class Addition {
	
       public static void main(String[] args) {
		//1st matrix
		int a[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element");
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
		}
			
		}
		System.out.println("..1st matrix...");

		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		
		}
		//2nd matrix
		
		int b[][]=new int[2][2];
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element");
		
		for(int i=0;i<b.length;i++) {
			
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=sc.nextInt();
		}
			
		}
		System.out.println("..2nd matrx..");

		for(int i=0;i<b.length;i++) {
			
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		
		}//addition
		
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.print(+c[i][j]);
			}
			System.out.println();
		}
		System.out.println("Above matrx is addition of two matrix");
				
			}
			
		
		

	}


