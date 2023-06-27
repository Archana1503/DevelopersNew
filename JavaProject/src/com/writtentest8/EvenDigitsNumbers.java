package com.writtentest8;//2.	Write a java program to find numbers between 100 and 400 
//(both included) where each digit of a number is an even number.

public class EvenDigitsNumbers {
    public static void main(String[] args) {
        System.out.println("Numbers between 100 and 400 with all even digits:");
        
        EvenDigitsNumbers obj = new EvenDigitsNumbers();
        obj.findEvenDigitsNumbers(100, 400);
    }

    public void findEvenDigitsNumbers(int n1, int n2) {
        for (int num = n1; num <= n2; num++) {
            if (hasAllEvenDigits(num)) {
                System.out.println(num);
            }
        }
    }

    public boolean hasAllEvenDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
