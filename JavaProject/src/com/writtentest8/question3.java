package com.writtentest8;
//3.	WAP to print pattern 
//1
//2 3
//4 5 6
//78910
//11 12 13 14 15


public class question3 {
    public static void main(String[] args) {
        int num = 1;
        int rowCount = 1;

        while (rowCount <= 5) {
            for (int i = 1; i <= rowCount; i++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            rowCount++;
        }
    }
}
