package com.logicalarray;//find minimum element from array
import java.util.Scanner;

public class MimimumElement {
	public void findMin(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("mim="+min);
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
		
		MimimumElement m= new MimimumElement();
		m.findMin(arr);
		
		

	}

}
