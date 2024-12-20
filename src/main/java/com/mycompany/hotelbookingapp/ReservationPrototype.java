/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */

// Prototype Pattern for Cloning Reservations
class ReservationPrototype implements Cloneable {
    private String customer;
    private String room;
    private String checkIn;
    private String checkOut;

    public ReservationPrototype(String customer, String room, String checkIn, String checkOut) {
        this.customer = customer;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    protected ReservationPrototype clone() {
        try {
            return (ReservationPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Reservation [Customer: " + customer + ", Room: " + room + ", Check-in: " + checkIn + ", Check-out: " + checkOut + "]";
    }
}