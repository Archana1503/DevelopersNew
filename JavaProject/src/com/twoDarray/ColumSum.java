package com.twoDarray;

public class ColumSum {
	public static void sumOfcolumn(int a[][]) {
		int sum;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j=0;j<a[i].length;j++) {
			sum=sum+a[j][i];
			System.out.print(a[i][j]+" ");
			
		}
		System.out.print("sum="+sum);
		System.out.println();
		
	}
}
		
	

	public static void main(String[] args) {
		int a[][]= {{1,2,4},{2,3,5},{3,5,6}};
		ColumSum .sumOfcolumn(a);
		

	}

}
