package com.logicalarray;

public class FindMinChar {
	public void findmin(char arr[]) {
		
	char minchar=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<minchar) {
			minchar=arr[i];
		}
	}
	System.out.println(minchar);

}


	public static void main(String[] args) {
		 char[] arr = {'z', 'm', 'b', 'A', 'd'};
		 FindMinChar c= new FindMinChar();
		 c.findmin(arr);
	       
	}
		

}
