/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelbookingapp;

import javax.swing.SwingUtilities;

/**
 *
 * @author Aliaa Gamal
 */
public class HotelBookingApp {



   
        


    public static void main(String[] args) {
        
         
        SwingUtilities.invokeLater(() -> {
            new ReservationSystemGUI().setVisible(true);
        
        
            // Singleton Example
            
            ReservationManager reservationManager = ReservationManager.getInstance();
            PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();
            
            // Factory Example
            Room room = RoomFactory.createRoom("deluxe");
            Customer customer = CustomerFactory.createCustomer("vip");
            
            // Builder Example
            ReservationBuilder builder = new ReservationBuilder();
            String reservation = builder.setCustomer(customer.getProfile())
                    .setRoom(room.getDescription())
                    .setDates("2024-12-20", "2024-12-25")
                    .build();
            reservationManager.addReservation(reservation);
            
            // Prototype Example
            ReservationPrototype prototype = new ReservationPrototype(customer.getProfile(), room.getDescription(), "2024-12-20", "2024-12-25");
            ReservationPrototype clonedReservation = prototype.clone();
            reservationManager.addReservation(clonedReservation.toString());
            
            // Adapter Example
            ExternalCustomerService externalService = new ExternalCustomerService();
            CustomerServiceAdapter adapter = new CustomerServiceAdapter(externalService);
            System.out.println(adapter.getCustomerData("12345"));
        
        }); 

    }  
}