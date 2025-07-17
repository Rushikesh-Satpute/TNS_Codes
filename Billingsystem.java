package com.application.myapp;
import java.util.Scanner;

public class Billingsystem {
	
  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Number of Tickets: ");
	        int count = sc.nextInt();

	        System.out.print("Enter Price per Ticket: ");
	        double price = sc.nextDouble();

	        Ticket booking = new Ticket(name, count, price);

	        System.out.println("\nSelect Payment Method:\n1. Cash\n2. Wallet\n3. Credit Card");
	        System.out.print("Enter choice (1/2/3): ");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter cash amount: ");
	                double cash = sc.nextDouble();
	                booking.makePayment(cash);
	                break;

	            case 2:
	                sc.nextLine(); // consume leftover newline
	                System.out.print("Enter Wallet Name (e.g., Paytm, PhonePe): ");
	                String wallet = sc.nextLine();
	                System.out.print("Enter amount: ");
	                double walletAmt = sc.nextDouble();
	                booking.makePayment(wallet, walletAmt);
	                break;

	            case 3:
	                sc.nextLine(); // consume leftover newline
	                System.out.print("Enter Card Number: ");
	                String cardNum = sc.nextLine();
	                System.out.print("Enter Card Holder Name: ");
	                String holder = sc.nextLine();
	                System.out.print("Enter Expiry Date (MM/YY): ");
	                String expiry = sc.nextLine();
	                System.out.print("Enter amount: ");
	                double cardAmt = sc.nextDouble();
	                booking.makePayment(cardNum, holder, expiry, cardAmt);
	                break;

	            default:
	                System.out.println("Invalid Payment Method!");
	                return;
	        }

	        booking.printReceipt();
	        sc.close();
	    }
	}