package com.assignment2khadijamam;
import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {
	void add(int arr[],int pos,int size,int new_val)

	{
		for(int i=size-1;i>=pos;i--)
		{
			arr[i+1]=arr[i];
			
		}
		arr[pos]=new_val;
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]=new int[6];
		InsertArray i1=new InsertArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter pos u want to insert");
		int pos=sc.nextInt();
		
		System.out.println("enter new value");
		int value=sc.nextInt();
		
		int size=5;
		i1.add(arr, pos, size, value);
	}
	
		
		

	}


