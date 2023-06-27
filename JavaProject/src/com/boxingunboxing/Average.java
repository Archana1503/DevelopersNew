package com.boxingunboxing;

public class Average {

	public static void main(String[] args) {
		String str="virst scores 98 runs";
		int sum=0;
		float Average;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				sum=sum+(str.charAt(i)-'0');
			
			}
			
		}
		System.out.println("sum of digit"+sum);
		
   Average=sum/2;
   System.out.println("Avrage"+Average);
	}

}
