/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    

public class ReservationSystemGUI extends JFrame {
    private ReservationManager reservationManager;
    private PaymentProcessor paymentProcessor;

    private JTextField customerField, checkInField, checkOutField;
    private JComboBox<String> roomTypeCombo, customerTypeCombo;
    private JTextArea outputArea;

    public ReservationSystemGUI() {
        reservationManager = ReservationManager.getInstance();
        paymentProcessor = PaymentProcessor.getInstance();
        
        // إعداد واجهة المستخدم
        setTitle("Reservation System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // إعداد الحاويات
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel customerLabel = new JLabel("Customer Type:");
        customerTypeCombo = new JComboBox<>(new String[] { "Regular", "VIP", "Corporate" });
        
        JLabel roomLabel = new JLabel("Room Type:");
        roomTypeCombo = new JComboBox<>(new String[] { "Standard", "Deluxe", "Suite" });
        
        JLabel checkInLabel = new JLabel("Check-in Date:");
        checkInField = new JTextField();
        
        JLabel checkOutLabel = new JLabel("Check-out Date:");
        checkOutField = new JTextField();
        
        JButton submitButton = new JButton("Add Reservation");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addReservation();
            }
        });

        JButton processPaymentButton = new JButton("Process Payment");
        processPaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processPayment();
            }
        });

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        
        // إضافة المكونات إلى اللوحة
        panel.add(customerLabel);
        panel.add(customerTypeCombo);
        panel.add(roomLabel);
        panel.add(roomTypeCombo);
        panel.add(checkInLabel);
        panel.add(checkInField);
        panel.add(checkOutLabel);
        panel.add(checkOutField);
        panel.add(submitButton);
        panel.add(processPaymentButton);
        
        add(panel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    private void addReservation() {
        String customerType = (String) customerTypeCombo.getSelectedItem();
        String roomType = (String) roomTypeCombo.getSelectedItem();
        String checkInDate = checkInField.getText();
        String checkOutDate = checkOutField.getText();

        // استخدام Factory Patterns
        Customer customer = CustomerFactory.createCustomer(customerType.toLowerCase());
        Room room = RoomFactory.createRoom(roomType.toLowerCase());

        // استخدام Builder Pattern
        ReservationBuilder builder = new ReservationBuilder();
        String reservation = builder.setCustomer(customer.getProfile())
                                     .setRoom(room.getDescription())
                                     .setDates(checkInDate, checkOutDate)
                                     .build();

        reservationManager.addReservation(reservation);
        outputArea.append("Reservation added: " + reservation + "\n");
    }

    private void processPayment() {
        String paymentInfo = "Payment for the reservation.";
        paymentProcessor.processPayment(paymentInfo);
        outputArea.append("Payment processed: " + paymentInfo + "\n");
    }

}