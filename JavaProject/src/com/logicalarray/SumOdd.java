package com.logicalarray;

public class SumOdd {
    public static int findSumOfOddElements(int[] array) {
        int sum = 0;

        for (int num : array) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sumOfOddElements = findSumOfOddElements(array);
        System.out.println("Sum of odd elements: " + sumOfOddElements);
    }
}
