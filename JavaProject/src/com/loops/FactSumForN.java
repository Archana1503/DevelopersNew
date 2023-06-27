

package com.loops;
import java.util.Scanner;

public class FactSumForN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			sum += factorial;
		}

		System.out.println("Sum of the factorials up to " + n + " is: " + sum);
	}
}
