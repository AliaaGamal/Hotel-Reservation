/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */


// Singleton Pattern for Payment Processor
class PaymentProcessor {
    private static PaymentProcessor instance;

    private PaymentProcessor() {}

    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void processPayment(String payment) {
        System.out.println("Payment processed: " + payment);
    }
}