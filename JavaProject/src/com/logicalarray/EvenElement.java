package com.logicalarray;
import java.util.Scanner;

public class EvenElement {
	public  void showEven(int arr[])
	{
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enetr array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
			
		}
		
		
		EvenElement e=new EvenElement();
		e.showEven(arr);

	}

}
