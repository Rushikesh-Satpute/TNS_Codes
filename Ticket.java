package com.application.myapp;
import java.util.*;

public class Ticket {
	
	
	    private String customerName;
	    private int ticketCount;
	    private double ticketPrice;
	    private double totalAmount;

	    public Ticket(String customerName, int ticketCount, double ticketPrice) {
	        this.customerName = customerName;
	        this.ticketCount = ticketCount;
	        this.ticketPrice = ticketPrice;
	        this.totalAmount = ticketCount * ticketPrice;
	    }

	    // Cash
	    public void makePayment(double cashPaid) {
	        System.out.println("Payment Method: Cash");
	        System.out.println("Cash Paid: ₹" + cashPaid);
	    }

	    // Wallet
	    public void makePayment(String walletName, double walletAmount) {
	        System.out.println("Payment Method: Wallet");
	        System.out.println("Wallet: " + walletName);
	        System.out.println("Amount Paid: ₹" + walletAmount);
	    }

	    // Credit Card
	    public void makePayment(String cardNumber, String cardHolder, String expiryDate, double cardAmount) {
	        System.out.println("Payment Method: Credit Card");
	        System.out.println("Card Holder: " + cardHolder);
	        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
	        System.out.println("Expiry Date: " + expiryDate);
	        System.out.println("Amount Paid: ₹" + cardAmount);
	    }

	    public void printReceipt() {
	        System.out.println("\n====== Receipt ======");
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Tickets Booked: " + ticketCount);
	        System.out.println("Ticket Price: ₹" + ticketPrice);
	        System.out.println("Total Amount: ₹" + totalAmount);
	        System.out.println("=====================");
	    }
	}