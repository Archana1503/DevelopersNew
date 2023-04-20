package com.sunday;
import java.util.Arrays;

public class CharactorFrequency {
	static void findCharFraq(char arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean visited=false;
			int count=1;
			for(int j=i-1;j>0;j--)
			{
				if (arr[i]==arr[j])
						{
					visited=true;
					break;
						}
						
			}
			if(visited==false) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i]==arr[k])
						count++;
					
				}
				System.out.println(arr[i]+"....friquency is.."+count);
			}
			
		}
	}

	public static void main(String[] args) {
		char arr[]= {'a','d','a','t','a','d','t'};
		CharactorFrequency c=new CharactorFrequency();
		c.findCharFraq(arr);
		
		
		

	}

}
