package com.pojo;

public class Character1{
	int id;
	String name;
	String profile;
	public Character1(int id, String name, String profile) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
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
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Character1 [id=" + id + ", name=" + name + ", profile=" + profile + "]";
	}
	

}
