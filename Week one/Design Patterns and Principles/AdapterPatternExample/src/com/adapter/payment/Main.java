package com.adapter.payment;

public class Main {
    public static void main(String[] args) {
        // Using PayPal
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(500.0);

        // Using Stripe
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(750.0);

        // Using Razorpay
        PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayGateway());
        razorpay.processPayment(1000.0);
    }
}
