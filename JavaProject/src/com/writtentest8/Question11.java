package com.writtentest8;
//10.	Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.

//if employee is a male and age is in between 20 to 40 then he may work in anywhere

//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

//And any other input of age should print "ERROR".




	import java.util.Scanner;

	public class Question11 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter age ");
	        int age = scanner.nextInt();
	        scanner.nextLine();

	        System.out.print("Enter sex (M or F): ");
	        String sex = scanner.nextLine();

	        System.out.print("Enter marital status (Y or N): ");
	        String maritalStatus = scanner.nextLine();

	        String placeOfService;

	        if (sex.equalsIgnoreCase("F")) {
	            placeOfService = "Urban areas";
	        } else if (sex.equalsIgnoreCase("M")) {
	            if (age >= 20 && age <= 40) {
	                placeOfService = "Anywhere";
	            } else if (age > 40 && age <= 60) {
	                placeOfService = "Urban areas";
	            } else {
	                placeOfService = "ERROR";
	            }
	        } else {
	            placeOfService = "ERROR";
	        }

	        System.out.println("Place of Service: " + placeOfService);

	        scanner.close();
	    }
	}
