package com.pluralsight.springboot_dealership.dao;

import com.pluralsight.springboot_dealership.models.LeaseContract;

public interface LeaseDao {
    LeaseContract getLeaseContract(String vin);
    void addLeaseContract(String vin);
}
