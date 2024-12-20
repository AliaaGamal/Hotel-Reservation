/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */

class RoomFactory {
    public static Room createRoom(String roomType) {
        switch (roomType.toLowerCase()) {
            case "standard" -> {
                return new StandardRoom();
            }
            case "deluxe" -> {
                return new DeluxeRoom();
            }
            case "suite" -> {
                return new SuiteRoom();
            }
            default -> throw new IllegalArgumentException("Invalid room type");
        }
    }
}