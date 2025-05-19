/*8a. Q1. Read all the existing records from the table coffee which is from the database test and insert a
	new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and 
	JSP to get the fields and display the results respectively*/
package com.mysql;

import java.sql.*;
import java.util.Properties;

public class MysqlSelectInsert {

    public static void main(String[] args) {
        Connection dbConnection = null;
        try {
            String url = "jdbc:mysql://localhost/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", ""); // Set your MySQL password if any

            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            // Read all records
            String selectQuery = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);

            System.out.println("\nExisting coffee records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("price");  // Corrected column name
                System.out.format("%d, %s, %d\n", id, coffee_name, price);
            }
            rs.close();

            // Insert new record using PreparedStatement
            String insertSQL = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            PreparedStatement pstmt = dbConnection.prepareStatement(insertSQL);
            pstmt.setString(1, "Tajmahal");
            pstmt.setInt(2, 950);
            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("New coffee inserted successfully!");
            }

            pstmt.close();
            st.close();
            dbConnection.close();

        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
