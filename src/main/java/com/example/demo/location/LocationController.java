package com.example.demo.location;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationservice;


    @RequestMapping(value="/locations")
    public List<Location> getAllLocation(){

        return locationservice.getAllLocation();
    }

    @RequestMapping(value="/locations/{id}")
    public Location getLocationById(@PathVariable final String id) {
        return locationservice.getLocationById(id);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public void addLocation(@RequestBody Location location) {
        locationservice.addLocation(location);
    }
}