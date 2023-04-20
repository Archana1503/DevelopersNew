package com.conditions;
import java.util.Scanner;
public class VovelAndConsonent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		
		
		char ch=sc.next().charAt(0);
		
		
		//if(ch>=A&&ch<==Z)||(ch>=a&&ch<=z)
		
		// TODO Auto-generated method stub
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='o'||ch=='u')
		{
			System.out.println("Given charactor" +" " +ch + " "+"is vowel" );
		}
		else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
		{
			System.out.println("Given charactor" +" " +ch + " "+"is consonent" );
		
		}else
		{
			System.out.println("Given charactor is not alphabate"+ch);
		}

	}

}





