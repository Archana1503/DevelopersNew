package com.logicalarray;
import java.util.Scanner;


public class DisplayOdd {
	public void showOddElemement(int[]a) {
		for (int i=0;i<a.length;i++) {
			if (a[i]%2==1) {
				System.out.println(a[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		DisplayOdd o=new DisplayOdd();
		o.showOddElemement(arr);

	}

}
