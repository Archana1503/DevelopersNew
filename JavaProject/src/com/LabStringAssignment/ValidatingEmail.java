package com.LabStringAssignment;
import java.util.Scanner;

public class ValidatingEmail {
	public static void vaidateEmail(String str) {
		 boolean flag = false;
	      for (int i = 0; i < str.length(); i++) {
	         char ch = str.charAt(i);
	         if ((ch >= 'a' && ch <= 'z'&& ch >= 'A' && ch <= 'Z')&&(ch>='0' && ch <= 9)
	        		 && (ch=='!'||ch=='@'||ch=='#'||ch=='%'||ch=='&')||ch=='.') {
	            flag = true;
	         }
	      }
	      if(flag)
	         System.out.println("Given string is a proper email.");
	      else
	         System.out.println("Given string is not proper email.");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Email Address: ");
	      String str = sc.nextLine();
	      ValidatingEmail v=new ValidatingEmail();
	      v.vaidateEmail(str);
	     
	   }
	}

	
