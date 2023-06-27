package com.labassignmentmap;
import java.util.LinkedHashMap;
/*Question1. Create a Linkedhashmap<int,String> where key is integers 1 to 10 and
	string is number in words.Remove entry for which number is divisible by 3*/

public class RemoveDivisible3 {
	

	


		public static void main(String[] args) {

			LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
			lhm.put(1, "mumabai");
			lhm.put(2, "pune");
			lhm.put(3, "nasik");
			lhm.put(4, "ahmadnagr");
			lhm.put(5, "rahuri");
			lhm.put(6, "shirur");
			lhm.put(7, "haveli");
			lhm.put(8, "Auranagabad");
			lhm.put(9, "Buldahan");
			lhm.put(10, "Thane");

			lhm.entrySet().removeIf(entry -> entry.getKey() % 3 == 0);

			System.out.println(lhm);
		}

	}