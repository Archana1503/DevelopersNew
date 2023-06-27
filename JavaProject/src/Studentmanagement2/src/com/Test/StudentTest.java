package com.Test;
import java.util.Scanner;
import com.Dao.StudentCrud;
import com.Dao.StudentImpl;
import com.Exceptionss.NameNotFoundException;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println("Display All Student Data ");
		String input = "";

		Scanner sc = new Scanner(System.in);

		StudentCrud student = new StudentImpl();//created instance of studentimpl class and assign it to 
//studentCrud interface variable student
		//allowes flexiblity and allowes to swich between diffrent implementation of studentcrud interface
		//without changing code
		do {
			
			System.out.println("\n!...Student Management System...");
			System.out.println("1. Add a student");
			System.out.println("2. Remove a student");
			System.out.println("3. Search for a student by name");
			System.out.println("4. Update Student");
			System.out.println("5. Display a list of all students");
			System.out.println("6. Display a list of students by course");
			System.out.println("0. Exit");

			System.out.print("Enter your choice ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				student.addStudent();
				break;

			case 2:
				student.removeStudent();
				break;

			case 3:
				try {
					student.searchStudent();
				} catch (NameNotFoundException e) {

					System.err.println(e.getMessage());
				}
				break;

			case 4:
				student.updateStudent();
				break;

			case 5:
				student.displayAllStudents();
				break;

			case 6:
				student.displayStudentsByCourse();
				break;

			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");

			}
			System.out.println();

			System.out.println("Do you want to continue y/n");
			input = sc.next();

		} while (input.equalsIgnoreCase("Y"));

		sc.close();
	}
}
