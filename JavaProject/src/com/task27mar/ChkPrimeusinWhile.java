package com.task27mar;
import java.util.Scanner;

public class ChkPrimeusinWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int n = 2;
        boolean isPrime = true;

        while (n <= num / 2) {
            if (num % n == 0) {
                isPrime = false;
                break;
            }
            n++;
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
