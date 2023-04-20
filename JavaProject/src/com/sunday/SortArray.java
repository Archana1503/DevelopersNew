package com.sunday;

import java.util.Arrays;

public class SortArray {
	public void display(char[]arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]<arr[j])) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=(char) temp;
				}
			}
			System.out.println(arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		char arr[]= {'a','c','e','y','w'};
		SortArray s=new SortArray();
		s.display(arr);
		

	}

}
