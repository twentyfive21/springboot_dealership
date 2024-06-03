package com.pluralsight.springboot_dealership.controllers;

import com.pluralsight.springboot_dealership.dao.LeaseDao;
import com.pluralsight.springboot_dealership.models.LeaseContract;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaseContractsController {
    private LeaseDao leaseDao;

    public LeaseContractsController(LeaseDao leaseDao) {
        this.leaseDao = leaseDao;
    }

    // http://localhost:8080/lease
    @RequestMapping(path="/lease/{id}", method = RequestMethod.GET)
    public LeaseContract getLeaseContract(String id){
        return leaseDao.getLeaseContract(id);
    }

    @RequestMapping(path = "/lease", method = RequestMethod.POST)
    public void addLeaseContract(@RequestBody LeaseContract leaseContract) {
        leaseDao.addLeaseContract(leaseContract.getVehicleID());
    }
}
