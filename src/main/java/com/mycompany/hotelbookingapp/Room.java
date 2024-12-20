/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */

// Factory Pattern for Room Types
abstract class Room {
    public abstract String getDescription();
}

class StandardRoom extends Room {
    @Override
    public String getDescription() {
        return "Standard Room";
    }
}

class DeluxeRoom extends Room {
    @Override
    public String getDescription() {
        return "Deluxe Room";
    }
}

class SuiteRoom extends Room {
    @Override
    public String getDescription() {
        return "Suite Room";
    }
}

