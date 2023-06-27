package com.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.Dao.MovieCrud;
import com.Dao.MovieImpl;
import com.pojo.Character1;
import com.pojo.Movie1;

public class MovieTest {

	public static void main(String[] args) {
		System.out.println("Displaying Movie Information");
		String ans="";
		Scanner sc=new Scanner(System.in);
		int id,c_id;
		String name,c_name,c_profile;
		float rating;
		
		MovieCrud mc=new MovieImpl();//upcasting
		Movie1 m;
		
		List<Movie1> l;
		do
		{
			
		System.out.println("1.Add Movie");
		System.out.println("2.Update Movie");
		System.out.println("3.Delete Movie");
		System.out.println("4.show all movies");
		System.out.println("5 Show movie name on basis of actor");
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter movie id");
			id=sc.nextInt();
			System.out.println("Enter movie name");
		    name=sc.next();
			System.out.println("Enter movie rating");
			rating=sc.nextFloat();
			System.out.println("Enter character id");
			c_id=sc.nextInt();
			System.out.println("Enter character name");
		    c_name=sc.next();
		    System.out.println("Enter character profile");
		    c_profile=sc.next();
		    Character1 c=new Character1(c_id,c_name,c_profile);
		     m=new Movie1(id,name,rating,c);
		   mc.add(m);
	  
		    
		    
			break;
		case 3:
		    mc.remove();
			
		
		
		case 4:
			l=mc.show();
			
			System.out.println(l);
			break;
		case 5:
			l=mc.showByActorName();
			HashMap<String,ArrayList<String>> hs=new HashMap();
			
			
			Iterator<Movie1> it=l.iterator();
			
			while(it.hasNext())
			{
				Movie1 m1=it.next();
				String s=m1.getA().getName();
				
				if(hs.containsKey(s))
				{
					ArrayList<String> al=hs.get(s);
					al.add(m1.getName());
					hs.put(s, al);
				}
				else
				{
					ArrayList<String> al=new ArrayList<String>();
					al.add(m1.getName());
					hs.put(s, al);
				}
				
			}
			System.out.println(hs);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//ArrayList<String> al=new ArrayList<>();
//			for(int i=0;i<l.size();i++)
//			{
//				Movie1 m1=l.get(i);
//				for(int j=i+1;j<l.size();j++)
//				{	
//					Movie1 m2=l.get(j);
//				
//				if(m1.getA().getName().equals(m2.getA().getName()))
//				{
//					System.out.println(m1.getName()+" "+m2.getName());
//				}
//				}
//			}
			
			
			
			
			
		
		}
			
			System.out.println("Do you want to continue yes/no");
		ans=sc.next();
		
	
		}while(ans.equalsIgnoreCase("yes"));
	

}
}
