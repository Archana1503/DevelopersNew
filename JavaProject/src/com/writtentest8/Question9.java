package com.writtentest8;
//9.	A salesmen is given commission on the basis of sales he makes .
//He gets a commission of 5% only if sales made by him is above 2000.
//WAP to accept sales amount and calculate the commission he gets.

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the sales amount: ");
        double salesAmount = scanner.nextDouble();
        
        double commission = 0.0;
        if (salesAmount > 2000) {
            commission = salesAmount * 0.05;
        }
        
        System.out.println("Commission: " + commission);
        
        scanner.close();
    }
}
