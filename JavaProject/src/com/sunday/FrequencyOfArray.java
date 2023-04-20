package com.sunday;

public class FrequencyOfArray {

		static void find(int arr[])
		{
			for(int i=0;i<arr.length;i++ )
			{
				boolean visited=false;
				int count=1;
				for(int j=i-1;j>=0;j--)//backword to check number is visited or not
				{
					if (arr[i]==arr[j])
							{
						visited=true;
						break;
							}
				}
				if(visited==false) 
				{
					for(int k=i+1;k<arr.length;k++)
					{
						if(arr[i]==arr[k])
						{
							count++;
						}
					}
					System.out.println(arr[i]+"frequency is "+count);
				}
			}
		}
		
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,1,0,5,4,3,1,2};
		FrequencyOfArray f=new FrequencyOfArray();
		f.find(arr);

	}

}
