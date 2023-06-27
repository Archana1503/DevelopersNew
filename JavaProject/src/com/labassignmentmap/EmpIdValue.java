package com.labassignmentmap;

//Create a Linkedhashmap which contains Emp is keys and Emp id is values.
import java.util.LinkedHashMap;

public class EmpIdValue {

	public static void main(String[] args) {

			LinkedHashMap<String, Integer> emp = new LinkedHashMap<>();
			emp.put("Archana", 07);
			emp.put("Rahul", 02);
			emp.put("Sumit", 03);
			emp.put("Sonal", 05);

			System.out.println(emp);
		}

	}