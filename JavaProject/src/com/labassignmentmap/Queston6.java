package com.labassignmentmap;
//create map which has alphabate as key and integer as value

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Queston6 {

          public static void main(String[] args) {

			ArrayList<String> al = new ArrayList<>();
			al.add("A+2");
			al.add("B+12");
			al.add("D+4");
			al.add("DD+5");

			Map<Character, Integer> m = new HashMap<>();

			for (String a : al) {

				String[] arr = a.split("\\+");

				if (m.containsKey(arr[0].charAt(0))) {
					Integer c = m.get(arr[0].charAt(0)) + Integer.parseInt(arr[1]);
					m.put(arr[0].charAt(0), c);

				} else {
					m.put(arr[0].charAt(0), Integer.parseInt(arr[1]));
				}

			}
			System.out.println(m);
		}

	}
