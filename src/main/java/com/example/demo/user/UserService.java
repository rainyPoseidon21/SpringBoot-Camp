package com.example.demo.user;

import java.util.*;

import com.example.demo.location.*;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {

    ArrayList<User> userList = new ArrayList<User>() {
        {
            add(new User("u1", "fn1", "ln1", new Location("l1","l1n"), "eu1@gmail.com"));
            add(new User("u2", "fn2", "ln2", new Location("l2","l2n"), "eu2@gmail.com"));
        }
    };

    public ArrayList<User> getAllUser(){

        return userList;
    }

    public User getUser(String id){
        
        User user = userList.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);

        return user;
    }

    
}