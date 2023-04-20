package com.string;//check given String is palindrom or not using string buffer

public class PalindromString {

	public static void main(String[] args) {
		String s="hello";
		
		StringBuffer sb=new StringBuffer(s);
		
		sb.reverse();
		String rever=sb.toString();
		
		
		System.out.println(s);
		System.out.println(sb);
		
		
		
		if(rever==s) {
			System.out.println("Given string is palindrom");
		}
		else {
			System.out.println("not Palindrom string");
		}
		
		
		
		
		

	}

}
