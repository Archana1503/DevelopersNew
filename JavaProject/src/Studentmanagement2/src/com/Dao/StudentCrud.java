package com.Dao;
import java.util.List;
import com.pojo.Student;
import com.Exceptionss.NameNotFoundException;
	

	public interface StudentCrud {

		public void addStudent();

		public void removeStudent();

		public void updateStudent();

		public void searchStudent() throws NameNotFoundException;

		List<Student> displayAllStudents();

		List<Student> displayStudentsByCourse();

	}
