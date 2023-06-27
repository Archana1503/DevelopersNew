package com.logicalarray;


import java.util.Scanner;

public class FindMax {
	public void findMax(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max="+max);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array element");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		
		FindMax m= new FindMax();
		m.findMax(arr);
		
		

	}

}
