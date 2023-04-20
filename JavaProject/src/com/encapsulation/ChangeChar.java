package com.encapsulation;//change char upper to lower and lower to upper.

import java.util.Scanner;

public class ChangeChar {
	public static void ChangeCha(char c)
	{
		if(c>='A'&&c<='Z')//convert capital into small
		{ 
			c=(char)(c+32);
		}
			
		//when i get number convert this into charactor
		else if(c>='a'&&c<='z');
		{
			c=(char)(c-32);
			
		}
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		ChangeChar.ChangeCha(ch);
				
	

	}

}
//no output