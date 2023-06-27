package com.treemap;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Student7 implements Comparable<Student7> {

	int id;
	String name;

	public Student7(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		TreeMap<Student7, Integer> tm = new TreeMap<>();
		tm.put(new Student7(1, "Ram"), 89);
		tm.put(new Student7(2, "Sita"), 70);
		tm.put(new Student7(3, "Laxaman"), 98);
		tm.put(new Student7(4, "Hanuman"), 68);
		tm.put(new Student7(3, "Laxaman"), 98);

		for (Map.Entry<Student7, Integer> m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	@Override
	public int compareTo(Student7 o) {
		
		return this.id-o.id;
	}
}


