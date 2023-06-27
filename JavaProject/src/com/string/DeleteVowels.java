package com.string;//delete vowels
import java.util.Scanner;

public class DeleteVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = deleteVowels(input);
        System.out.println("String after removing vowels: " + result);
    }

    public static String deleteVowels(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
