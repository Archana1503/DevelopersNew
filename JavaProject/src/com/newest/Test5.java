package com.newest;

public class Test5 {


	public static void main(String[] args) {
		String str="1a5tzet2h4";


		int sum=0;

		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
			sum+=(str.charAt(i)-'0');
		}
	}

	System.out.println("sum of digit="+sum);
		}



	}


