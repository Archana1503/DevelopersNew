package com.pojo;

public class Movie1 {
	int id;
	String name;
	float rating;
	Character1 a;
	public Movie1(int id, String name, float rating, Character1 a) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.a = a;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Character1 getA() {
		return a;
	}
	public void setA(Character1 a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Movie1 [id=" + id + ", name=" + name + ", rating=" + rating + ", a=" + a + "]";
	}
	
	

}
