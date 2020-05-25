package com.example.demo.location;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationservice;


    @RequestMapping(value="/locations")
    public List<Location> getAllLocation(){

       

        return locationservice.getAllLocation();
    }
    
}