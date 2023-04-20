package com.assignment2khadijamam;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
	int size;int index;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter array element");
	for(int i = 0;i<size;i++) {
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Enter arrays index");
	index=sc.nextInt();
	for(int i=index;i<size-1;i++) {
		arr[i]=arr[i+1];
	}
	size--;
	for(int i=0;i<size;i++) {
		System.out.println(arr[i]+" ");
	}
	
	
	}
	
}
	
	