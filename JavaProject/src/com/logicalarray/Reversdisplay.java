package com.logicalarray;//display element in reverse 
import java.util.Scanner;




public class Reversdisplay {
	public void reverse(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size=sc.nextInt();
		System.out.println("Enter array element");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]+" ");
		}
		
		
		Reversdisplay r=new Reversdisplay();
		r.reverse(arr);

	}

}
