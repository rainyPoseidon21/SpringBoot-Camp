package com.example.demo.location;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {


    @RequestMapping(value="/locations")
    public List<Location> getAllLocation(){

        List<Location> locationList = new ArrayList<Location>(){
            {
                add(new Location("l1", "UK"));
                add(new Location("l2","US"));
            }
        };

        return locationList;
    }
    
}