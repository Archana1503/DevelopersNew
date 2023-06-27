package com.labassignmentcolle;//check last logic iterator
import java.util.ArrayList;
import java.util.Iterator;
class Location {
	int l_id;
	String l_name;

	public Location(int l_id, String l_name) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
	}

	@Override
	public String toString() {
		return "Location [l_id=" + l_id + ", l_name=" + l_name + "]";
	}
}

	class Employee22 {
		int e_id;
		String e_name;
		Location l;

		public Employee22(int e_id, String e_name, Location l) {
			super();
			this.e_id = e_id;
			this.e_name = e_name;
			this.l = l;
		}

		@Override
		public String toString() {
			return "Employee22 [e_id=" + e_id + ", e_name=" + e_name + ", l=" + l + "]";
		}

		public static void findLocation(ArrayList<Employee22> list) {

			Iterator<Employee22> itr = list.iterator();
			while (itr.hasNext()) {
				Employee22 e = itr.next();

				if (e.l.l_name.equals(e.l.l_name)) {
					if (itr.hasNext()) {
						System.out.println(e);
						itr.next();

					}

				}
			}

		}

	}

	public class EmpCitySame {

		public static void main(String[] args) {

			ArrayList<Employee22> list = new ArrayList<Employee22>();
			list.add(new Employee22(1, "Rahul", new Location(101, "pune")));

			list.add(new Employee22(2, "sameer", new Location(102, "mumbai")));
			list.add(new Employee22(3, "rohit", new Location(103, "pune")));
			list.add(new Employee22(4, "shyamal", new Location(104, "delhi")));
			list.add(new Employee22(4, "neha", new Location(104, "Ahmednagar")));

			System.out.println(list);
			Employee22.findLocation(list);

			
			System.out.println();

		}

	}
	

