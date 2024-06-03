package com.pluralsight.springboot_dealership.models;

public class LeaseContract extends Contract {

    public LeaseContract(String salesID, String vehicleID) {
        super(salesID, vehicleID);
    }

    @Override
    public String getSalesID() {
        return super.getSalesID();
    }


    @Override
    public void setSalesID(String salesID) {
        super.setSalesID(salesID);
    }


    @Override
    public String getVehicleID() {
        return super.getVehicleID();
    }


    @Override
    public void setVehicleID(String vehicleID) {
        super.setVehicleID(vehicleID);
    }
}
