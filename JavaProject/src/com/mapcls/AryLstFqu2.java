package com.mapcls;//mam code

import java.util.ArrayList;

public class AryLstFqu2 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("nasik");
		al.add("pune");
		al.add("mumbai");
		//System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).compareTo(al.get(j))==0)
				{
					count++;
					al.remove(j);
				}
			}
			System.out.println(al.get(i)+" "+count);
		}

	}

}
