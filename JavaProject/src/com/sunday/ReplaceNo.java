package com.sunday;//replaceno

public class ReplaceNo {
	public void display(int arr[]) {
		int i;
		int temp=30;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==temp) {
				arr[i]=0;
			}
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
int arr[]= {12,30,10,30,40,10,30};
ReplaceNo d=new ReplaceNo();
d.display(arr);
	}

}
