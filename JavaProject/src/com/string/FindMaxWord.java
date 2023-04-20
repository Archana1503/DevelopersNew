package com.string;
import java.util.Arrays;

public class FindMaxWord {
	public void displayLarge(String s) {
		String[] word=s.split(" ");
		String longword=word[0];
		
		System.out.println(Arrays.toString(word));
		for(int i=0;i<word.length;i++)
			if(word[i].length()>longword.length())
			{
				longword=word[i];
			}
	
		System.out.println("Longest word="+longword);
}


	public static void main(String[] args) {
		
String s="India is Beautiful Country";

FindMaxWord f=new FindMaxWord();
f.displayLarge(s);
	}

}
