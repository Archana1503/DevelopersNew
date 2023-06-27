package com.logicalarray;//actual display element

import java.util.Arrays;

public class DisplayReverse {
	public void displayreverse(int[]arr) {
		System.out.println(Arrays.toString(arr));
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++){
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j--;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
		
	public static void main(String[] args) {
		int arr[]= {22,3,44,56,77};//{4,2,6,8,1,5}; 
		DisplayReverse d=new DisplayReverse();
		d.displayreverse(arr);
		
		

	}

}
