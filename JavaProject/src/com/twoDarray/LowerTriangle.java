package com.twoDarray;
import java.util.Scanner;


public class LowerTriangle {

	public static void main(String[] args) {
	
	int i, j, rows, columns;
	Scanner sc=new Scanner(System.in);
		
	System.out.println("\n Please Enter  Matrix Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		System.out.println("\n Please Enter the UT Matrix Items :  ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}		
		}
		System.out.println("\n---The lower Triangle of the given Matrix---");
		for(i = 0; i < rows ; i++)
		{
			System.out.print("\n");
			for(j = 0; j < columns; j++)
			{
				if(i >= j) {
					System.out.format("%d \t", arr[i][j]);
				}
				else {
					System.out.print("0 \t");	
				}
			}
		}
	}
}