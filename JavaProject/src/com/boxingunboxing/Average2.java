package com.boxingunboxing;

public class Average2 {

	public static void main(String[] args) {
		String str="virat scores 98 runs";
		int sum=0;
		float average;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)))
				sum=sum+Character.getNumericValue(str.charAt(i));
			
		}
		System.out.println(sum);
		average=sum/2;
		System.out.println(average);
	}

}
