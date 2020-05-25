package com.example.demo.location;

import java.util.*;


import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private List<Location> locationList = new ArrayList<Location>(){
        {
            add(new Location("l1", "UK"));
            add(new Location("l2","US"));
        }
    };

    public List<Location> getAllLocation(){
        return locationList;
    }
    
}