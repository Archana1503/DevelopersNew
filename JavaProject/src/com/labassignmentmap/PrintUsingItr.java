package com.labassignmentmap;
//Question3 ...Create a Map which contain Integer as key and Another Map as Value
//another Map Contain Emp as Key and Integer as value Print the Map
//using Iterator.

import java.util.HashMap;
import java.util.Map;

class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}

public class PrintUsingItr {

	public static void main(String[] args) {

		Map<Emp, Integer> hm = new HashMap<>();
		hm.put(new Emp(1, "Archana"), 101);
		hm.put(new Emp(2, "Rahul"), 202);
		hm.put(new Emp(3, "Shayam"), 303);

		Map<Emp, Integer> hm1 = new HashMap<>();
		hm.put(new Emp(11, "Archana"), 101);
		hm.put(new Emp(22, "Rahul"), 202);
		hm.put(new Emp(33, "Shyam"), 303);

		Map<Integer, Map<Emp, Integer>> hm2 = new HashMap<>();
		hm2.put(101, hm);
		hm2.put(202, hm1);

		for (Map.Entry<Integer, Map<Emp, Integer>> xy : hm2.entrySet()) {

			for (Map.Entry<Emp, Integer> st : xy.getValue().entrySet()) {
				System.out.println(st.getKey() + " " + st.getValue());
			}
		}

	}

}