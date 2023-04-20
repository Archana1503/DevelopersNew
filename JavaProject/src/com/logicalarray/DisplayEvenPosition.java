package com.logicalarray;//display element at even postion

import java.util.Scanner;

public class DisplayEvenPosition {
	public void showPositon(int[]a) {
	for(int i=0;i<=a.length;i++) {
		if(i%2==0) {
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
		DisplayEvenPosition p=new DisplayEvenPosition ();
		p.showPositon(arr);
		
		
	}

}
