package com.LabAssignment;

public class EvenOddSeprate {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenArray = new int[inputArray.length];
        int[] oddArray = new int[inputArray.length];
        int evenCount = 0;
        int oddCount = 0;

        for (int num : inputArray) {
            if (num % 2 == 0) {
                evenArray[evenCount++] = num;
            } else {
                oddArray[oddCount++] = num;
            }
        }

        System.out.println("Even Array:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        System.out.println("Odd Array:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}
