package com.pojo;

public class Course {
	private int c_id;
	private String c_name;
	private int fees;

	public Course(int c_id, String c_name, int fees) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.fees = fees;
	}

	public int getCourse_id() {
		return c_id;
	}

	public void setCourse_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCourse_name() {
		return c_name;
	}

	public void setCourse_name(String course_name) {
		this.c_name = c_name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + c_id + ", course_name=" + c_name + ", fees=" + fees + "]";
	}

}