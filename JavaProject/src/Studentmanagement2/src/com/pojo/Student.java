package com.pojo;
import java.util.*;
public class Student {

	private int s_id;
	private String s_name;
	private String s_city;
	private int stud_percentage;
	private ArrayList<Course>cs;
	private int s_percentage;

	public Student(int s_id, String s_name,String s_city, int s_percentage,ArrayList<Course> c) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_city = s_city;
		this.stud_percentage = s_percentage;
		this.cs = c;
	}

	public int getStud_id() {
		return s_id;
	}

	public void sets_id(int s_id) {
		this.s_id = s_id;
	}

	public String getStud_name() {
		return s_name;
	}

	public void setStud_name(String stud_name) {
		this.s_name = s_name;
	}

	public String getStud_city() {
		return s_city;
	}

	public void setStud_city(String stud_city) {
		this.s_city = stud_city;
	}

	public int getS_percentage() {
		return s_percentage;
	}

	public void setStud_percentage(int s_percentage) {
		this.s_percentage = s_percentage;
	}

	public ArrayList<Course> getC() {
		return cs;
	}

	public void setC(ArrayList<Course> c) {
		this.cs = c;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + s_id + ", stud_name=" + s_name + ", stud_city=" + s_city
				+ ", stud_percentage=" + s_percentage + ", c=" + cs + "]";
	}

}
