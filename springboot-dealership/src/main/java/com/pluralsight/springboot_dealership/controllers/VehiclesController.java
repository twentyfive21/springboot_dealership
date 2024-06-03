package com.pluralsight.springboot_dealership.controllers;

import com.pluralsight.springboot_dealership.dao.VehicleDao;
import com.pluralsight.springboot_dealership.models.Vehicle;
import org.springframework.web.bind.annotation.*;

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

    // http://localhost:8080/vehicles?minYear=2018&maxYear=2020
    @RequestMapping(path="/vehicles", method = RequestMethod.GET, params = {"minYear","maxYear"})
    public ArrayList<Vehicle> getVehiclesByYear(@RequestParam("minYear") int minYear, @RequestParam("maxYear") int maxYear){
        return vehicleDao.getVehiclesByYear(minYear, maxYear);
    }

    // http://localhost:8080/vehicles?color=white
    @RequestMapping(path="/vehicles", method = RequestMethod.GET, params = {"color"})
    public ArrayList<Vehicle> getVehiclesByColor(@RequestParam("color") String color){
        return vehicleDao.getVehiclesByColor(color);
    }

    // http://localhost:8080/vehicles?minOdo=0&maxOdo=15000
    @RequestMapping(path="/vehicles", method = RequestMethod.GET, params = {"minOdo","maxOdo"})
    public ArrayList<Vehicle> getVehiclesByMileage(@RequestParam("minOdo") int minOdo, @RequestParam("maxOdo") int maxOdo){
        return vehicleDao.getVehiclesByMileage(minOdo, maxOdo);
    }

    // http://localhost:8080/vehicles?type=sedan
    @RequestMapping(path="/vehicles", method = RequestMethod.GET, params = {"type"})
    public ArrayList<Vehicle> getVehiclesByType(@RequestParam("type") String type){
        return vehicleDao.getVehiclesByType(type);
    }

    @RequestMapping(path="/vehicles", method = RequestMethod.POST)
    public void addVehicleToDB(@RequestBody Vehicle vehicle){
        vehicleDao.addVehicleToDB(vehicle);
    }

    @RequestMapping(path="/vehicles/{vin}", method = RequestMethod.DELETE)
    public void removeVehicleToDB(@PathVariable int vin){
        vehicleDao.removeVehicleToDB(vin);
    }

    @RequestMapping(path = "/vehicles/{vin}", method = RequestMethod.PUT)
    public void updateVehicleToDB(@PathVariable int vin, @RequestBody Vehicle vehicle){
        vehicleDao.updateVehicleToDB(vin,vehicle);
    }




}
