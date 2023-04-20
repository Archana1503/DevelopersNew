package com.string;
import java.util.Scanner;

public class ReverseWord {
	public static void eachWordReverse(String str) {
		String s[]=str.split(" ");
		String reverse="";
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			String reverseword="";
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseword=reverseword+word.charAt(j);
				
			}
			reverse=reverse+" "+reverseword;
		}
		System.out.println(reverse);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		
		ReverseWord.eachWordReverse(s);
		

	}

}
