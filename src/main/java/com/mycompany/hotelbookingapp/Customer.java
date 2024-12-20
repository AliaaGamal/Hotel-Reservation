/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */

// Factory Pattern for Customer Profiles
abstract class Customer {
    public abstract String getProfile();
}

class RegularCustomer extends Customer {
    @Override
    public String getProfile() {
        return "Regular Customer";
    }
}

class VIPCustomer extends Customer {
    @Override
    public String getProfile() {
        return "VIP Customer";
    }
}

class CorporateCustomer extends Customer {
    @Override
    public String getProfile() {
        return "Corporate Customer";
    }
}
