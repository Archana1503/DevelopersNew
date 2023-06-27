package com.newest;
import java.util.Scanner;

public class ArrMaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print(" Enter element ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];

        for (int i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

       System.out.println( min+" "+ max);

    }
}