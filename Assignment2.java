package com.application.myapp;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		long balance = 1000L;
		int pin = 1234;
		int n = 0;
		System.out.print("Enter your ATM Pin: ");

		Scanner scan = new Scanner(System.in);
		int Inputpin = scan.nextInt();
		if (Inputpin  != pin) {
			System.out.println("You Entered Wrong Pin, Try Again later");
		}
		while(n != 4) {
			System.out.println();
			System.out.println("++++++++Smart ATM Machine+++++++");
			System.out.println("1. Check Balance");
			System.out.println("2. Debit Money");
			System.out.println("3. Credit Money");
			System.out.println("4. Exit");
			System.out.print("Choose Option: ");
			n = scan.nextInt();
			
		switch(n) {
			case 1:
				System.out.println("Your Balace is: " + balance);
				break;
			case 2:
				System.out.print("Enter Amount you want to debit: ");
				long debit = scan.nextLong();
				
				balance -= debit;
				System.out.println("Amount debited.");
				break;
			case 3:
				System.out.print("Enter Amount you want to credit: ");
				long credit = scan.nextLong();
				balance += credit;
				System.out.println("Amount credited, New balance is " + balance);
				break;
			default:
				System.out.print("Exited");
				break;
			}
		}
	}
}
