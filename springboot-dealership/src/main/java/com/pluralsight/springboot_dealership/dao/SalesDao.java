package com.pluralsight.springboot_dealership.dao;

import com.pluralsight.springboot_dealership.models.SaleContract;

public interface SalesDao {
    SaleContract getSaleContract(String vin);
    void addSaleContract(String vin);
}
