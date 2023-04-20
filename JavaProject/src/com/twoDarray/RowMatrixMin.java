package com.twoDarray;//find minimum row from matrix

public class RowMatrixMin {
	public static void RowMin(int arr[][]) {
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i][0];
			for(int j=0;j<arr[i].length;j++)
			{
			if(min>arr[i][j]) {
				min=arr[i][j];
			}
			}
			System.out.println("min="+min);
			
			
			
			
		}
		
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,4},{2,3,5},{3,5,6}};
		RowMatrixMin.RowMin(arr);
		
		

	}

}
