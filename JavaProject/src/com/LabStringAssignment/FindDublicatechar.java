package com.LabStringAssignment;//not recoomended to do this code
//insted use boolean is visited method

public class FindDublicatechar {
	
	public static void main(String[] args) {
		int count;
	
		String str="India is my Country";
		
		char sp[]=str.toCharArray() ;
		
		
		//char sp[]=str.toCharArray();
		
		System.out.println("dublicate charactor in gven strin is");
		for(int i=0;i<sp.length;i++) {
			 count=1;
			for(int j=i+1;j<sp.length;j++) {
				if(sp[i]==sp[j]&& sp[i]!='0') {
					count++;
					sp[j]='0';
				
			}
				
			}
				
				if(count>1 && sp[i]!='0') 
				System.out.println(sp[i]);
			}
		}
}
	
