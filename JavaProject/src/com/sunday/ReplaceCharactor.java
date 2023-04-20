package com.sunday;


public class ReplaceCharactor {
	public void display(char arr[]) {

	
	int temp=2;
	//public void changChar(char ch[]) {
		for(char i=0;i<arr.length;i++) {
			
	if(arr[i]=='y'||arr[i]=='z'){
			arr[i]=(char)(arr[i]-24);
		}else {
			arr[i]=(char) (arr[i]+temp);
			
		}
		System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args) {
		
		char arr[]= {'a','e','s','z'};
		ReplaceCharactor a=new ReplaceCharactor();
		a.display(arr);
		
		}

	}


