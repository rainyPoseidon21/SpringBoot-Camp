package com.example.demo.user;

import com.example.demo.location.*;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   

    
    @RequestMapping(value="users")
    public ArrayList<User> getAllUser(){

        ArrayList<User> userList = new ArrayList<User>() {
            {
                add(new User("u1", "fn1", "ln1", new Location("l1","l1n"), "eu1@gmail.com"));
                add(new User("u2", "fn2", "ln2", new Location("l2","l2n"), "eu2@gmail.com"));
    
               
            }
        };

        return userList;

    }

}