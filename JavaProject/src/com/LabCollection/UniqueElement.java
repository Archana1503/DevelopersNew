package com.LabCollection;
import java.util.ArrayList;
public class UniqueElement {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();	
		al.add("mango");
		al.add("apple");
		al.add("kiwi");
		al.add("grapes");
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<String> al3 = new ArrayList<String>();

		al2.add("mango");
		al2.add("apple");
		al2.add("banana");
		al2.add("watermelon");

		for (int i = 0; i < al.size(); i++) {
			if (!al2.contains(al.get(i))) {
				al3.add(al.get(i));
			}
		}

		for (int i = 0; i < al2.size(); i++) {
			if (!al.contains(al2.get(i))) {
				al3.add(al2.get(i));
			}
		}

		System.out.println("Unique Elements:");
		for (String element : al3) {
			System.out.println(element);
		}
	}
}
