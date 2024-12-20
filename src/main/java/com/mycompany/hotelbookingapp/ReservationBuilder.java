/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */

// Builder Pattern for Building Reservations
class ReservationBuilder {
    private String customer;
    private String room;
    private String checkIn;
    private String checkOut;

    public ReservationBuilder setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    public ReservationBuilder setRoom(String room) {
        this.room = room;
        return this;
    }

    public ReservationBuilder setDates(String checkIn, String checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return this;
    }

    public String build() {
        return "Reservation [Customer: " + customer + ", Room: " + room + ", Check-in: " + checkIn + ", Check-out: " + checkOut + "]";
    }
}