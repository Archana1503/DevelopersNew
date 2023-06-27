package com.LabAssignment;//2.print unique and dublicate element in an array



public class UniqueElement {
	
	static void find(int arr[])
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
					 System.out.println(arr[i]+" is  element with times  "+count);
					 System.out.println("......");
						 
					 }
				 if(count>1) {
						 System.out.println(arr[i]+" is dublicate element s  "+count);
					 }
					
				 
				 }
		}
		
	}
	
		
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2,4,5,5,6,1};
		UniqueElement u=new UniqueElement();
		u.find(arr);
		
		
	}
		
		

	}



