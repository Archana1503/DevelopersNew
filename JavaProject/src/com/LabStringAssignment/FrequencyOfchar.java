package com.LabStringAssignment;//input from user.
import java.util.Scanner;

public class FrequencyOfchar {
	
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
					// String s1=new String(arr);
					 //System.out.println(s1);
		 System.out.println(arr[i]+"frequency....."+count+" ");
				 
					 if(count>1) {
					 System.out.println(arr[i]+" dublicate  "+count);
						 
					 }
					 else {
						 System.out.println(arr[i]+"unique"+count);
					 }
					 }
		}
		
		}
	}
	
		public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
 
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
 
        
	     FrequencyOfchar f=new FrequencyOfchar();
	     f.find(str);
		

	}

}

