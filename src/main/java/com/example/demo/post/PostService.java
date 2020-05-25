package com.example.demo.post;

import java.util.*;

import com.example.demo.location.*;
import com.example.demo.user.*;

import org.springframework.stereotype.Service;

@Service
public class PostService {

    Post p1 = new Post("p1", "pd1", new User("u1", "fn1", "ln1", new Location("l1","l1n"), "eu1@gmail.com") ,"dp1");
    Post p2 = new Post("p2", "pd2", new User("u2", "fn2", "ln2", new Location("l2","l2n"), "eu2@gmail.com"), "dp2");
 
    private List<Post> posts =  Arrays.asList(p1,p2);


    public List<Post> listPost(){

        return posts;
     }

     public Post getPostbyId(String id){

        Post post = posts.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);

        return post;
     }
    
}