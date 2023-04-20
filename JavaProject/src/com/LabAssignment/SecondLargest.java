package com.LabAssignment;
//import java.util.Scanner; 

public class SecondLargest {
	
	public void largestNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					//System.out.println();
				}
			}
		}
		//System.out.println(arr);
		System.out.println("..second largest element is...");
		int large=arr[arr.length-2];
		System.out.println(large);
		
	}

	public static void main(String[] args) {
		int arr[]= {4,5,7,8,9,1};
		SecondLargest s=new SecondLargest();
		s.largestNumber(arr);

	}

}
