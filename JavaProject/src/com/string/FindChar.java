package com.string;

public class FindChar {
	public static void charactorCount(String str) 
	{
	
		int specialchar=0;
		int totalDigits=0;
		int totalVowels=0;
		int totalConsonent=0;
		int TotalSpace=0;
		String s=str;
		s=s.toLowerCase();
		
		
	for(int i=0;i<str.length();i++){
		if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			totalVowels++;
			
		}
		else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
			totalConsonent++;
			
		}
		else if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
				totalDigits++;
				
		}else if(s.charAt(i)=='!'||s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)=='%'||
				s.charAt(i)=='&')
		{
			specialchar++;
		}else {
			TotalSpace++;
		}
	}
	System.out.println(" total vowels"+totalVowels);
	System.out.println("total digits"+totalDigits);
	System.out.println("total consonent"+totalConsonent);
	System.out.println("Total space"+TotalSpace);
	System.out.println("specialchar "+specialchar);
	
	}

		public static void main(String[] args) {
		
String str="Hello @java123";

FindChar f=new FindChar();
 f.charactorCount(str);


	}

}

