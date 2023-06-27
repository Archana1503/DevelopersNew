package com.logicalarray;//change case
import java.util.Arrays;
import java.util.Scanner;
public class ChangeCase {
	public void changeCharCase(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] - 32);
			} else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] + 32);
			} else {
				arr[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		//System.out.println(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		char arr[] = new char[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		System.out.println();

		ChangeCase c = new ChangeCase();
		c.changeCharCase(arr);

		sc.close();
	}
}
