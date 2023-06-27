package com.Dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import com.pojo.Course;
import com.pojo.Student;


import com.Exceptionss.NameNotFoundException;

public class StudentImpl implements StudentCrud {

	List<Student> al = new ArrayList<Student>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void addStudent() {

		System.out.println("Enter Student Id  ");
		int s_id = sc.nextInt();

		System.out.println("Enter Student Name  ");
		String s_name = sc.next();

		System.out.println("Enter Student City : ");
		String s_city = sc.next();

		System.out.println("Enter the Student Percentage : ");
		int s_per = sc.nextInt();

		ArrayList<Course> cs = new ArrayList<>();
		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter Course Id : ");
			int c_id = sc.nextInt();
			System.out.println("Enter Course Name : ");
			String c_name = sc.next();

			System.out.println("Enter Course Fees : ");
			int fees = sc.nextInt();
			cs.add(new Course(c_id, c_name, fees));

		}

		al.add(new Student(s_id, s_name,  s_city, s_per, cs));

		System.out.println("\n Student added successfully.....");
	}

	@Override
	public void removeStudent() {

		System.out.println("Enter the Student id you want to Remove : ");
		int r_id = sc.nextInt();

		Iterator<Student> itr = al.iterator();

		while (itr.hasNext()) {
			Student str = itr.next();
			if (str.getStud_id() == r_id) {
				itr.remove();
			}
		}

		System.out.println("Student Removed Successfully...");

	}

	@Override
	public void updateStudent() {

		System.out.println("Enter Student id you want to Update : ");
		int s_id = sc.nextInt();

		for (Student s : al) {
			if (s_id == s.getStud_id()) {
				ArrayList<Course> c = s.getC();

				for (Course sc : c) {
					System.out.println(sc.getCourse_name());
				}
				System.out.println("Enter te couser name");
				String cname = sc.next();
				for (Course cs : c) {
					if (cs.getCourse_name().equalsIgnoreCase(cname)) {
						System.out.println("Enter the New Fees For that Course : ");
						int new_fee = sc.nextInt();

						cs.setFees(new_fee);
					}
				}

			}
		}

		System.out.println("Student Update Successfully...");
	}

	@Override
	public void searchStudent() throws NameNotFoundException {

		System.out.println("Enter Student Name : ");
		String name = sc.next();
		Student s = null;//not manadatory but 
		int flag = 0;
		for (int i = 0; i < al.size(); i++) {
			s = al.get(i);
			if (s.getStud_name().equalsIgnoreCase(name)) {

				flag = 1;
				break;

			}
		}

		if (flag == 1) {
			System.out.println("Student Id : " + s.getStud_id());
			System.out.println("Student Name : " + s.getStud_name());
			
			System.out.println("Student City : " + s.getStud_city());
			System.out.println("Student Percentage : " + s.getS_percentage());
			System.out.println("Course : " + (s.getC()));

		} else {
			throw new NameNotFoundException("Student name " + name + " not found...");
		}
	}

	@Override
	public List<Student> displayAllStudents() {

		System.out.println("\n List of all students:");

		for (Student s : al) {

			System.out.println("Student Id : " + s.getStud_id());
			System.out.println("Student Name : " + s.getStud_name());
		
			System.out.println("Student City : " + s.getStud_city());
			System.out.println("Student Percentage : " + s.getS_percentage());
			ArrayList<Course> cs = s.getC();

			for (Course c : cs) {

				System.out.println("Course Id : " + c.getCourse_id());
				System.out.println("Course Name : " + c.getCourse_name());
				System.out.println("Course Fees : " + c.getFees());
			}

			
		}

		return al;

	}

	@Override
	public List<Student> displayStudentsByCourse() {

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		Iterator<Student> itr = al.iterator();

		while (itr.hasNext()) {
			Student str = itr.next();
			ArrayList<Course> s = str.getC();

			for (Course c : s) {
				String cname = c.getCourse_name();

				if (map.containsKey(cname)) {
					ArrayList<String> list = map.get(cname);
					list.add(str.getStud_name());
					map.put(cname, list);

				} else {
					ArrayList<String> list1 = new ArrayList<String>();
					list1.add(str.getStud_name());
					map.put(cname, list1);
				}
			}
		}

		Set<Entry<String, ArrayList<String>>> ent = map.entrySet();

		for (Map.Entry<String, ArrayList<String>> m : ent) {

			System.out.println(m.getKey() + "  " + m.getValue());
		}

		System.out.println("Name of Students By Course....");
		return al;

	}
}