package com.example.demo.post;

import com.example.demo.user.*;
import com.example.demo.location.*;


import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {


    @RequestMapping(value = "/posts")
    public List<Post> listPost(){

       Post p1 = new Post("p1", "pd1", new User("u1", "fn1", "ln1", new Location("l1","l1n"), "eu1@gmail.com") ,"dp1");
       Post p2 = new Post("p2", "pd2", new User("u2", "fn2", "ln2", new Location("l2","l2n"), "eu2@gmail.com"), "dp2");

       return Arrays.asList(p1,p2);

    }
    
}