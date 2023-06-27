package com.LabStringAssignment;
import java.util.Arrays;

public class ReverseEachWord {
	public void Reverse(String str) {
		String[]sp=str.split(" ");
		for(int i=0;i<sp.length;i++) {
			String temp=sp[i];
			
			char[]ch=temp.toCharArray();
			
			for(int j=0,k=ch.length-1;j<ch.length/2;j++,k--) {
				
				char chTemp=ch[j];
				ch[j]=ch[k];
				ch[k]=chTemp;
			}
			
			System.out.println(Arrays.toString(ch));
			
		}
	}

	public static void main(String[] args) {
		String str="Hello Java";
		ReverseEachWord r=new ReverseEachWord();
		r.Reverse(str);
		
		

	}

}
