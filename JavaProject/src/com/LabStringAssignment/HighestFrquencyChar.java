package com.LabStringAssignment;

public class HighestFrquencyChar {
	static void find(String str) {
		
		char arr[]=str.toCharArray();
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
						 System.out.println(arr[i]+"frequency....."+count+" ");
					 }
			}
			
				
			}
		
			}
		
		
		


	public static void main(String[] args) {
		String str="java is oops programming language";
		
		
		FrequencyOfCha  f=new FrequencyOfCha ();
			f.find(str);
			
			
		}
			
			

		}
