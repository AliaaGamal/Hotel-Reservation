/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */

class CustomerServiceAdapter {
    private ExternalCustomerService externalService;

    public CustomerServiceAdapter(ExternalCustomerService externalService) {
        this.externalService = externalService;
    }

    public String getCustomerData(String customerId) {
        return externalService.fetchCustomerData(customerId);
    }
}
