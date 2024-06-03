package com.pluralsight.springboot_dealership.controllers;

import com.pluralsight.springboot_dealership.dao.SalesDao;
import com.pluralsight.springboot_dealership.models.SaleContract;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SalesContractsController {
    private SalesDao salesDao;

    public SalesContractsController(SalesDao salesDao) {
        this.salesDao = salesDao;
    }

    // http://localhost:8080/sales/{vin}
    @RequestMapping(path="/sales/{id}", method = RequestMethod.GET)
    public SaleContract getSaleContract(@PathVariable String id){
        return salesDao.getSaleContract(id);
    }

    @RequestMapping(path="/sales", method = RequestMethod.POST)
    public void addSaleContract(@RequestBody String vin){
        salesDao.addSaleContract(vin);
    }
}
