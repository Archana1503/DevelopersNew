package com.LabAssignment;
import java.util.Scanner;


public class DublicateElement {
	public void dublicateFind(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		DublicateElement d=new DublicateElement();
		d.dublicateFind(arr);
			
		}
		
		

	}


