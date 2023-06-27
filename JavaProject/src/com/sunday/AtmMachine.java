package com.sunday;
import java.util.Scanner;

public class AtmMachine {
    int pin = 1503;
    int balance =5000;
    String username;
    int password;
    int withdraw;
    int deposit;
    int num;

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        username = sc.next();
        System.out.println("Enter password");
        password = sc.nextInt();
        if (pin == password) {
            System.out.println("Welcome to Maharashtra Bank");
            display();
        } else {
            System.out.println("Invalid credentials. Please enter correct username and password.");
        }
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. EXIT");
            System.out.println("Please enter any of the above options:");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Welcome to the withdrawal option:");
                    System.out.println("Enter withdrawal amount:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash...." + "\nYour current balance is " + balance);
                    } else {
                        System.out.println("Insufficient balance. Please deposit an amount into your account.");
                    }
                    break;

                case 2:
                    System.out.println("Enter deposit amount:");
                    deposit = sc.nextInt();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println(deposit + " This amount is successfully deposited. Your current balance is: " + balance);
                    } else {
                        System.out.println("Please deposit a valid amount.");
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 4:
                    System.out.println("You have signed off your session. Thank you for using Maharashtra Bank ATM.");
                    System.exit(0);
            }
        } while (num != 4);
    }

    public static void main(String[] args) {
        AtmMachine atm = new AtmMachine();
        atm.menu();
    }
}
