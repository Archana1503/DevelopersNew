package com.logicalarray;//wrong 


import java.util.Arrays;

public class Mock1 {
	public void displayreverse(int[]arr) {
		System.out.println(Arrays.toString(arr));
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++){
		
		int temp=arr[i];
		arr[i]=arr[j+1];
		arr[j]=temp;
		j--;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
		
	public static void main(String[] args) {
		int arr[]= {22,3,44,56,77};//{4,2,6,8,1,5}; 
		Mock1 d=new Mock1();
		d.displayreverse(arr);
		
		

	}

}
