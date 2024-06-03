package com.pluralsight.springboot_dealership.dao;

import com.pluralsight.springboot_dealership.models.LeaseContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class JdbcLeaseDao implements LeaseDao{
    @Autowired
    private DataSource dataSource;

    @Override
    public LeaseContract getLeaseContract(String id) {
        String query = "SELECT * FROM LeaseContracts WHERE LeaseId = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return new LeaseContract(resultSet.getString("LeaseId"), resultSet.getString("Vin"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Log an error or return an appropriate message if no contract with the given
        // ID is found
        System.err.println("Error: Failed to fetch lease contract with ID " + id);
        return null;
    }

    @Override
    public void addLeaseContract(String vin) {
        try {
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement preparedStatement1 = connection.prepareStatement(
                            "INSERT INTO LeaseContracts (Vin) VALUES (?)");

            ) {
                preparedStatement1.setString(1, vin);
                preparedStatement1.executeUpdate();

            }
        } catch (SQLException e) {
            System.out.println("\n~~~~ Cannot add Vehicle to be leased ~~~~");
        }
    }
}
