package com.twoDarray;//find maximum row in matrix

public class RowMaxMin {
	public static void RowMax(int arr[][]) {
		for(int i=0;i<arr.length;i++)
		{
			int max=arr[i][0];
			for(int j=0;j<arr[i].length;j++)
			{
			if(max<arr[i][j]) {
				max=arr[i][j];
			}
			}
			System.out.println("max"+max);
			
			}
		
	}
	
	public static void main(String[] args) {
		int arr[][]= {{1,2,4},{2,3,5},{3,5,6}};
		RowMaxMin .RowMax(arr);
		

	}

}
