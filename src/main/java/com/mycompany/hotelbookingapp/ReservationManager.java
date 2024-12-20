/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */

// Singleton Pattern for Reservation Manager
class ReservationManager {
    private static ReservationManager instance;

    private ReservationManager() {}

    public static ReservationManager getInstance() {
        if (instance == null) {
            instance = new ReservationManager();
        }
        return instance;
    }

    public void addReservation(String reservation) {
        System.out.println("Reservation added: " + reservation);
    }
}