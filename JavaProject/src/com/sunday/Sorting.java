package com.sunday;

public class Sorting {
	static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}
		

	


	public static void main(String[] args) {
		
int arr[]= {7,6,12,-4,15,-1};
//Sorting s=new Sorting();

sort(arr);
}
}
