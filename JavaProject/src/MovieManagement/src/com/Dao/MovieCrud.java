package com.Dao;

import java.util.List;

import com.pojo.Movie1;

public interface MovieCrud {
	void add(Movie1 m);
	void remove();
	void serach();
	void update();
	List<Movie1> show();
	List<Movie1> showByActorName();
	
	

}




