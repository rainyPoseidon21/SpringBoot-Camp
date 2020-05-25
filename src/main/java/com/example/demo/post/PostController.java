package com.example.demo.post;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;


    @RequestMapping(value = "/posts")
    public List<Post> listPost(){

       return postService.listPost();

    }

    @RequestMapping(value="/posts/{id}")
    public Post getPostbyId(@PathVariable final String id){
        return postService.getPostbyId(id);
    }

    @RequestMapping(value="/posts",method=RequestMethod.POST)
    public void addPost(@RequestBody Post post){
         postService.addPost(post);
    }
    
}