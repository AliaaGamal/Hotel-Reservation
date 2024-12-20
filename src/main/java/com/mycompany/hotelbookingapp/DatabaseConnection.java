/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;

/**
 *
 * @author Aliaa Gamal
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=hotel_bookin";
    private static final String USER = "sa";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            System.out.println("تم الاتصال بقاعدة البيانات بنجاح!");
        } catch (SQLException e) {
            System.out.println("فشل الاتصال بقاعدة البيانات!");
            e.printStackTrace();
        }
    }
}