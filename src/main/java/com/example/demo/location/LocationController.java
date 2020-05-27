package com.example.demo.location;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationservice;

    //(GET)
    @RequestMapping(value="/locations")
    public String getAllLocation(Model model){
        
        List<Location> locations = locationservice.getAllLocation();
        model.addAttribute("locations",locations);

        return "locations";
        //return locationservice.getAllLocation();
    }

    //get by id(GET)
    @RequestMapping(value="/locations/{id}")
    public Optional<Location> getLocationById(@PathVariable final String id) {
        return locationservice.getLocation(id);
    }

    //(POST)
    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public void addLocation(@RequestBody Location location) {
        locationservice.addLocation(location);
    }

    //(PUT)

    @RequestMapping(value="/locations/{id}", method = RequestMethod.PUT)
    public void updateLocation(@RequestBody Location location, @PathVariable String id){
        locationservice.updateLocation(location,id);
    }

    //(DELETE)
    @RequestMapping(value="/locations/{id}",method=RequestMethod.DELETE)
    public void deleteLocation(@PathVariable String id){
        locationservice.deleteLocation(id);
    }
}