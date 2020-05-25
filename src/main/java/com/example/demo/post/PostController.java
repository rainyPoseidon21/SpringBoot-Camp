package com.example.demo.post;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;


    @RequestMapping(value = "/posts")
    public List<Post> listPost(){

       return postService.listPost();

    }
    
}