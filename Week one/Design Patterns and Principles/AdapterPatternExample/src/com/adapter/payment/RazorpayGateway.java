package com.adapter.payment;

public class RazorpayGateway {
    public void doTransaction(double amount) {
        System.out.println("Paid ₹" + amount + " using Razorpay.");
    }
}
