/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelbookingapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aliaa Gamal
 */


public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/HotelBooking"; // ضع هنا عنوان قاعدة البيانات واسمها
    private static final String USER = "root"; // اسم المستخدم
    private static final String PASSWORD = "password"; // كلمة المرور

    private Connection connection;

    public DatabaseManager() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // إضافة الحجز إلى قاعدة البيانات
    public void addReservationToDB(String customerType, String roomType, String checkInDate, String checkOutDate) {
        String sql = "INSERT INTO Reservations (customer_type, room_type, check_in, check_out) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, customerType);
            stmt.setString(2, roomType);
            stmt.setString(3, checkInDate);
            stmt.setString(4, checkOutDate);
            stmt.executeUpdate();  // تنفيذ الاستعلام لإضافة الحجز
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // غلق الاتصال بقاعدة البيانات
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
