package com.string;//print right angle pattern



import java.util.Scanner;

public class Pattern {
    public static void patternDisplay(String str) {
        String[] s = str.split(" ");

        for (int i = 0; i < s.length; i++) {
            String word = s[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            s[i] = reverseWord;
        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s[j] + " ");
            }
            System.out.println(); // for a new line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        patternDisplay(s);
    }
}
    