package com.pluralsight.springboot_dealership.dao;

import com.pluralsight.springboot_dealership.models.SaleContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class JdbcSaleDao implements SalesDao{
    @Autowired
    private DataSource dataSource;

    @Override
    public SaleContract getSaleContract(String id) {
        String query = "SELECT * FROM SalesContracts WHERE SaleId = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Assuming the SaleContract constructor takes the salesID and vehicleID
                    return new SaleContract(resultSet.getString("SaleId"), resultSet.getString("Vin"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: Failed to fetch sales contract with VIN " + id);
        }
        return null;
    }

    @Override
    public void addSaleContract(String vin) {
        try {
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement preparedStatement1 = connection.prepareStatement(
                            "INSERT INTO SalesContracts (Vin) VALUES (?)");
                    PreparedStatement preparedStatement2 =
                            connection.prepareStatement("UPDATE Vehicles SET Sold = TRUE WHERE Vin = ?;")

            ) {
                preparedStatement1.setString(1, vin);
                preparedStatement1.executeUpdate();
                preparedStatement2.setString(1, vin);
                preparedStatement2.executeUpdate();

            }
        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println("\n~~~~ Cannot add Vehicle for sale! ~~~~");
        }
    }
}
