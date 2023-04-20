package com.string;//print right angle pattern
import java.util.Scanner;
public class Pattern {
	public static void patternDispaly(String str ) {

		String s[]=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			String pattern="";
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseword=reverseword+word.charAt(j);
				
			}
			reverse=reverse+" "+reverseword;
		}
		System.out.println(reverse);
		
			
			
			
			  for (int j=0; j<=i; j++) {
	          System.out.print(s.length);
	        }
	        System.out.println(); //for  new line
		
		
		
	}
	}

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a string: ");
	      String s = sc.nextLine();
	      Pattern p=new Pattern();
	      p.patternDispaly(s);

	      }
	   }
	

  