package com.sunday;
import java.util.Scanner;

public class AtmMachine {
	int pin=1503;
	int balance=5000;
	String username;
	int password;
	int withdraw;
	int deposite;
	int num;
	public void menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		username=sc.next();
		if(pin==password) {
			System.out.println("welcome to maharashtra bank");
			this.display();
		}else {
			System.out.println("invalid crediential please enter correct username and password");
			
		}
		
	}
	public void display() {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("MENU");
			
	System.out.println("1.Withdraw ");
	System.out.println("2.Deposite");
	System.out.println("3.check Balance");
System.out.println("4.EXIT");
System.out.println("please enter any of the above option");
num = sc.nextInt();

switch (num) {
case 1:
	System.out.println("Welcome to withdrowl option:");
System.out.println("Enter withdraw Amount:");
withdraw=sc.nextInt();
if(balance>500) {
	balance=balance-withdraw;
	System.out.println("please collect your cash...." +"\n Your current balance is "+balance);
	
}else {
	System.out.println("Insufficient balance please deposite Amount in your account:");
}
break;

}
		case 2:
			System.out.println("Enter Deposite Amount :");
			deposite = sc.nextInt();

			if (deposite > 0) {
				balance = balance + deposite;

				System.out.println(
						deposite + " This Amount is Successfuly deposited Your Current Balance is :" + balance);
			} else {
				System.out.println("Please Deposite Validate Amount :");
			}
			break;

		case 3:
			System.out.println("Your Current Balance Is : " + balance);
			break;

		case 4:
			System.out.println("You Signoff your Session......ThankYou For Using HDFC ATM :");
			System.exit(0);
		}
	} while (num != 4);

}

public static void main(String[] args) {

	AtmMachine atm = new AtmMachine();
	atm.menu();

}
}