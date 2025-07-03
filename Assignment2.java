package com.application.myapp;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pin = 1234;
        long balance = 10000L;
        String accountHolder = "Rushikesh Satpute";

        System.out.print("Enter your Bank PIN: ");
        int enteredPin = scan.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect Pin.");
            return;
        }

        System.out.println("\nWelcome to Smart Bank, " + accountHolder + "!");

        int choice = 0;
        while (choice != 4) {
            System.out.println("\n========= Menu =========");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance is ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    long withdraw = scan.nextLong();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful. Current Balance is ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ₹");
                    long deposit = scan.nextLong();
                    balance += deposit;
                    System.out.println("Deposit Successful. New Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scan.close();
    }
}
