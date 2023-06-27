package com.xobin;

import java.util.Scanner;
public class test7 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the elements separated by space: ");
	        String input = scanner.nextLine();

	        // Splitting the input string by space
	        String[] numbers = input.split(" ");

	        // Creating an array to store the converted integers
	        int[] array = new int[numbers.length];

	        // Converting each element to an integer and storing in the array
	        for (int i = 0; i < numbers.length; i++) {
	            array[i] = Integer.parseInt(numbers[i]);
	        }

	        // Calculating the sum of adjacent elements
	        int sum = 0;
	        for (int i = 0; i < array.length - 1; i++) {
	            sum += array[i] + array[i + 1];
	        }

	        System.out.println("Sum of adjacent elements: " + sum);
	    }
	}
