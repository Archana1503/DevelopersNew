package com.objectarray;//create array of student .student has id,name an 


import java.util.Scanner;

class Student {
    int stud_id;
    String stud_name;
    int[] stud_marks;

    public Student(int stud_id, String stud_name, int[] stud_marks) {
        this.stud_id = stud_id;
        this.stud_name = stud_name;
        this.stud_marks = stud_marks;
    }

    public String toString() {
        return stud_id + " " + stud_name + " " + stud_marks[0] + " " + stud_marks[1] + " " + stud_marks[2];
    }
}

public class ArrayInsideArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();

        Student[] students = new Student[numStudents];
        int studentNumber = 1; // Initialize the student number to 1

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter ID of student " + studentNumber + ":");
            int id = sc.nextInt();
            System.out.println("Enter the name of student " + studentNumber + ":");
            String name = sc.next();
            System.out.println("Enter the marks for three subjects (separated by spaces) of student " + studentNumber + ":");
            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                marks[j] = sc.nextInt();
            }
            students[i] = new Student(id, name, marks);

            studentNumber++; // Increment the student number after each iteration
        }

        System.out.println("\nStudents with a percentage above 60%:");

        for (int i = 0; i < numStudents; i++) {
            int totalMarks = students[i].stud_marks[0] + students[i].stud_marks[1] + students[i].stud_marks[2];
            double percentage = (double) totalMarks / 3;
            if (percentage > 60) {
                System.out.println(students[i]);
            }
        }
    }
}

