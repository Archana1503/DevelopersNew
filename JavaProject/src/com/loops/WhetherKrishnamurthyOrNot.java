package com.loops;
import java.util.Scanner;

public class WhetherKrishnamurthyOrNot {

    public static void main(String[] args) {
        int range;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of range");
        range = sc.nextInt();

        for (int i = 1; i <= range; i++)
            checkNum(i);
    }

    static int fact(int number) {
        int f = 1;
        while (number != 0) {
            f = f * number;
            number--;
        }
        return f; // Return the factorial value
    }

    static void checkNum(int number) {
        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            sum = sum + fact(tempNumber % 10);
            tempNumber /= 10;
        }

        if (sum == number)
            System.out.println(number + " is a Krishnamurthy number");
    }
}
