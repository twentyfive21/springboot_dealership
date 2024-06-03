package com.pluralsight.springboot_dealership.controllers;

import com.pluralsight.springboot_dealership.dao.VehicleDao;
import com.pluralsight.springboot_dealership.models.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class VehiclesController {

    private VehicleDao vehicleDao;

    public VehiclesController(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    // http://localhost:8080/vehicles
    @RequestMapping(path="/vehicles", method = RequestMethod.GET)
    public ArrayList<Vehicle> getVehiclesFromDB(){
        return vehicleDao.getVehiclesFromDB();
    }

    // http://localhost:8080/vehicles?minPrice=27000&maxPrice=45000
    @RequestMapping(path="/vehicles", method = RequestMethod.GET, params = {"minPrice","maxPrice"})
    public ArrayList<Vehicle> getVehiclesByPrice(@RequestParam("minPrice") double min, @RequestParam("maxPrice") double max){
        return vehicleDao.getVehiclesByPrice(min,max);
    }

    // http://localhost:8080/vehicles?make=audi&model=a4
    @RequestMapping(path="/vehicles", method = RequestMethod.GET, params = {"make","model"})
    public ArrayList<Vehicle> getVehiclesByMakeAndModel(@RequestParam("make") String make, @RequestParam("model") String model){
        return vehicleDao.getVehiclesByMakeAndModel(make, model);
    }

    @RequestMapping(path="/vehicles", method = RequestMethod.GET, params = {"minYear","maxYear"})
    public ArrayList<Vehicle> getVehiclesByYear(@RequestParam("minYear") int minYear, @RequestParam("maxYear") int maxYear){
        return vehicleDao.getVehiclesByYear(minYear, maxYear);
    }
}
