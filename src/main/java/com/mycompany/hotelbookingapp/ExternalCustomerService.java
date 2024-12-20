/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */

// Adapter Pattern for External Customer Services
class ExternalCustomerService {
    public String fetchCustomerData(String customerId) {
        return "External data for customer " + customerId;
    }
}