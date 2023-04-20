package com.assignment4th;//q1..deletes dublicates .

public class DeleteDublicateChar {

		static void find(char arr[])
		{
			for(int i=0;i<arr.length;i++) 
			{
				boolean visited=false;
				int count=1;
				for(int j=i-1;j>=0;j--)
				{
					 if (arr[i]==arr[j])
					 
					 { visited=true;
						 break;
					 }//backword to check visited or not
				}
					 if(visited==false) {
						 for(int k=i+1;k<arr.length;k++)
						 {
							 if(arr[i]==arr[k])
							 {
								 count++;
								 
							 }
							 
							 
						 }
					 
						 if(count==1) {
						 System.out.println(arr[i]+"  ");
							 
						 }
						
					 
					 }
			}
			
		}
		
			
		public static void main(String[] args) {
			char arr[]= {'a','b','b','n','u','y','x','s','y'};
			DeleteDublicateChar u=new DeleteDublicateChar();
			u.find(arr);
			
			
		}
			
			

		}





