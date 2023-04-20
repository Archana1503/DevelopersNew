package com.twoDarray;//upper triangle

public class DisplayLowerTriangle {
	public static void printMatrix(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	public static void upperTraingularMatrix(int matrix[][])
	{
		int row=matrix.length;
		int col=matrix[0].length;//if number of rows and colum not equall then
		if(row!=col) {
			System.out.println("matrix should be a square matrix");

			return;
		}else
		{
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i>j) {
						matrix[i][j]=0;
					}
				}
			
		}
			System.out.println("upper matrix is ");
			
	}
		printMatrix(matrix);
	}

	
	public static void main(String[] args) {
		int arr[][]= {{3,4,6},{4,6,5},{2,3,4}};
		
		DisplayLowerTriangle.upperTraingularMatrix(arr);
		

	}

}
