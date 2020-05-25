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

     List<Location> getAllLocation(){
        return locationList;
    }

     Location getLocationById(String id){
        
        Location location = locationList.stream().filter(t-> id.equals(t.getId())).findFirst().orElse(null);

        return location;
    }
    
}