package com.pluralsight.springboot_dealership.dao;

import com.pluralsight.springboot_dealership.models.Vehicle;

import java.util.ArrayList;

public interface VehicleDao {
    ArrayList<Vehicle> getVehiclesFromDB();
    ArrayList<Vehicle> getVehiclesByPrice(double min, double max);
    ArrayList<Vehicle> getVehiclesByMakeAndModel(String userMake, String userModel);
    ArrayList<Vehicle> getVehiclesByYear(int minYear, int maxYear);
    ArrayList<Vehicle> getVehiclesByColor(String userColor);
    ArrayList<Vehicle> getVehiclesByMileage(double minMiles, double maxMiles);
    ArrayList<Vehicle> getVehiclesByType(String userType);
    void addVehicleToDB(Vehicle vehicle);
    void updateVehicleToDB(int vin,Vehicle vehicle);
    void removeVehicleToDB(int userVin);




}
