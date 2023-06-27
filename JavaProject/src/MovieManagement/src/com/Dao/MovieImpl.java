package com.Dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.pojo.Movie1;

public class MovieImpl implements MovieCrud{
   List<Movie1> al=new ArrayList<Movie1>();
   Scanner sc=new Scanner(System.in);
	@Override
	public void add(Movie1 m) {
		


	   al.add(m);
	  

	
	
	}

	@Override
	public void remove() {
		System.out.println("Enet movie id you want to remove");
		int m_id=sc.nextInt();
		int flag=0;
		Iterator<Movie1> it=al.iterator();
		
		while(it.hasNext())
		{
			Movie1 m=it.next();
			if(m.getId()==m_id)
			{
				it.remove();
			}
		}
		
	}

	@Override
	public void serach() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Movie1> show() {
		
	return al;
	}

	@Override
	public List<Movie1> showByActorName() {
		return al;
	}

	@Override
	public void update() {
		System.out.println("Enet movie id you want to update");
		int m_id=sc.nextInt();
		for(Movie1 m:al)
		{
			if(m.getId()==m_id)
			{
				System.out.println("Enetr rating");
				int rating=sc.nextInt();
				m.setRating(rating);
				
			}
		}
		
	}

}
