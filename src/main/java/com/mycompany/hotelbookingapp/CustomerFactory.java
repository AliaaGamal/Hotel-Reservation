/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */
public class CustomerFactory {
    

    public static Customer createCustomer(String customerType) {
        switch (customerType.toLowerCase()) {
            case "regular":
                return new RegularCustomer();
            case "vip":
                return new VIPCustomer();
            case "corporate":
                return new CorporateCustomer();
            default:
                throw new IllegalArgumentException("Invalid customer type");
        }
    }
}
