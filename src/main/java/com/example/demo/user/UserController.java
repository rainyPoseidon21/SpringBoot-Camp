package com.example.demo.user;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/users")
    public List<User> getAllUsers(){
        
        return userService.getAllUser();
    }

    @RequestMapping(value ="/users/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }


}